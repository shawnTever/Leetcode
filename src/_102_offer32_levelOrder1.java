import java.util.*;

public class _102_offer32_levelOrder1 {

//    二叉树层序遍历
    public int[] levelOrder(TreeNode root){
        if (root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }

//  二叉树S型遍历
    public int[] sOrder(TreeNode root){
        if (root == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        stack1.add(root);
        list.add(root.val);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                TreeNode node = stack1.pop();
                if (node.left != null) {
                    stack2.add(node.left);
                    queue.add(node.left);
                }
                if (node.right != null) {
                    stack2.add(node.right);
                    queue.add(node.right);
                }
            }
            while (!queue.isEmpty()) {
                list.add(queue.poll().val);
            }
            while (!stack2.isEmpty()) {
                TreeNode node = stack2.pop();
                if (node.right != null) {
                    stack1.add(node.right);
                    queue.add(node.right);
                }
                if (node.left != null) {
                    stack1.add(node.left);
                    queue.add(node.left);
                }
            }
            while (!queue.isEmpty()) {
                list.add(queue.poll().val);
            }
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }

    /**
     *              20
     *            /   \
     *         15       25
     *        / \      / \
     *      7    17   22  27
     *     / \  / \
     *    6  9 16 18
     */
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);
        tree.insert(7);
        tree.insert(17);
        tree.insert(22);
        tree.insert(27);
        tree.insert(6);
        tree.insert(9);
        tree.insert(16);
        tree.insert(18);
        _102_offer32_levelOrder1 levelOrder1 = new _102_offer32_levelOrder1();
        int[] result = levelOrder1.sOrder(tree.root);
        System.out.println(Arrays.toString(result));

    }
}

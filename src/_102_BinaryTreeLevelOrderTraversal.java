import java.util.*;

public class _102_BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode root;

    public void insertTree(TreeNode root, TreeNode x) {
        if (root.val > x.val) {
            if (root.left == null) {
                root.left = x;
            }
            else {
                insertTree(root.left, x);
            }
        }
        else {
            if (root.right == null) {
                root.right = x;
            }
            else {
                insertTree(root.right, x);
            }
        }
    }

    public void insert(int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            root = node;
        } else {
            insertTree(root, node);
        }
    }


    private String inOrder(TreeNode tree) {
        if (tree != null) {
            String leftStr = inOrder(tree.left);
            String rightStr = inOrder(tree.right);
            return (leftStr.isEmpty() ? leftStr : leftStr + " " ) + tree.val
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }

    private String preOrder(TreeNode tree) {
        if (tree != null) {
            String leftStr = preOrder(tree.left);
            String rightStr = preOrder(tree.right);
            return tree.val + (leftStr.isEmpty() ? leftStr : " " + leftStr)
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }

//    Map<Integer, Integer> map = new LinkedHashMap<>();
//    Map<Integer, List<Integer>> map2 = new LinkedHashMap<>();
//    Stack<List<Integer>> stack = new Stack<>();
//    int depth = 0, MaxDepth = 0;
//
//
//    private void recursive(TreeNode root) {
//        if (root != null) {
//            depth += 1;
//            recursive(root.left);
//            recursive(root.right);
//            depth -= 1;
//            map.put(root.val, depth);
//            if (MaxDepth <= depth) MaxDepth = depth;
//        }
//    }
//
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        recursive(root);
//        List<List<Integer>> list = new ArrayList<>();
//
//        for (int key : map.keySet()) {
//            if (map2.containsKey(map.get(key))){
//                List<Integer> Listset = map2.get(map.get(key));
//                Listset.add(key);
//                map2.put(map.get(key), Listset);
//
//            }
//            else {
//                List<Integer> eachList = new ArrayList<>();
//                eachList.add(key);
//                map2.put(map.get(key), eachList);
//            }
//        }
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(MaxDepth);
//        System.out.println(map2.keySet());
//        System.out.println(map2.values());
//        for (List<Integer> key : map2.values()) {
//            stack.push(key);
//        }
//        while (!stack.isEmpty()) {
//            list.add(stack.pop());
//        }
//
//        return list;
//    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<>();
        List<Integer> partList = new LinkedList<>();

        if (root != null) {
            queue1.offer(root);
            while (!queue1.isEmpty() || !queue2.isEmpty()) {
                TreeNode node = null;
                while (!queue1.isEmpty()) {
                    node = queue1.poll();
                    if (node.left != null) queue2.offer(node.left);
                    if (node.right != null) queue2.offer(node.right);
                    partList.add(node.val);
                }
                if (!partList.isEmpty()) list.add(partList);
                partList = new LinkedList<>();
                while (!queue2.isEmpty()) {
                    node = queue2.poll();
                    if (node.left != null) queue1.offer(node.left);
                    if (node.right != null) queue1.offer(node.right);
                    partList.add(node.val);
                }
                if (!partList.isEmpty()) list.add(partList);
                partList = new LinkedList<>();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        _102_BinaryTreeLevelOrderTraversal tree = new _102_BinaryTreeLevelOrderTraversal();
//        tree.insert(7);
//        tree.insert(3);
//        tree.insert(15);
//        tree.insert(9);
//        tree.insert(20);
//        System.out.println(tree.preOrder(tree.root.right));
        System.out.println(tree.levelOrder(tree.root));
//        System.out.println(tree.root.val);
//        System.out.println(tree.root.left.val);
//        System.out.println(tree.root.right.val);

    }

}



import java.util.*;

public class Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
      }

    TreeNode root;

    public Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA() {
        root = null;
    }

    public Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA(int x) {
        root = new TreeNode(x);
    }

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
            return tree.val + (leftStr.isEmpty() ? leftStr : " "  + leftStr)
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        Deque<TreeNode> que = new ArrayDeque<>();
        Set<TreeNode> ancestor = new HashSet<>();

        parent.put(root, null);
        que.push(root);

        while (!parent.containsKey(p) || !parent.containsKey(q)) {
            TreeNode node = que.pop();
            if (node.left != null) {
                parent.put(node.left, node);
                que.push(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                que.push(node.right);
            }
        }

        while (p != null) {
            ancestor.add(p);
            p = parent.get(p);
        }

        while (!ancestor.contains(q)) {
            q = parent.get(q);
        }

        return q;
    }



    public static void main(String[] args) {
        Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA tree = new Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA();
        tree.insert(10);
        tree.insert(7);
        tree.insert(12);
        tree.insert(3);
        tree.insert(20);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(4);
        tree.insert(13);
        System.out.println(tree.preOrder(tree.root));
        Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA subtree1 = new Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA(3);
        Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA subtree2 = new Have_Some_unknown_Porblem_236_LowestCommonAncestor_LCA(8);
        System.out.println(tree.preOrder(subtree1.root));
        System.out.println(tree.preOrder(subtree2.root));

        System.out.println(tree.lowestCommonAncestor(tree.root, subtree1.root, subtree2.root).val);

    }
}

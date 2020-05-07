public class _572_isSubtree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
      }

    TreeNode root;

    public _572_isSubtree() {
        root = null;
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

    private String preOrder(TreeNode tree) {
        if (tree != null) {
            String leftStr = preOrder(tree.left);
            String rightStr = preOrder(tree.right);
            return (leftStr.isEmpty() ? leftStr : leftStr + " " ) + tree.val
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        else if (s == null || t == null) {
            return false;
        }
        else {
            if (s.val > t.val) {
                return isSubtree(s.left, t);
            }
            else if (s.val < t.val) {
                return isSubtree(s.right, t);
            }
            else {
                return isSubtree(s.right, t.right) && isSubtree(s.left, t.left);
            }
        }
    }

    public static void main(String[] args) {
        _572_isSubtree tree = new _572_isSubtree();
        tree.insert(10);
        tree.insert(7);
        tree.insert(12);
        tree.insert(3);
        tree.insert(20);
        tree.insert(2);
        tree.insert(8);
        tree.insert(9);
        tree.insert(4);
        System.out.println(tree.preOrder(tree.root));
        _572_isSubtree subtree = new _572_isSubtree();
        subtree.insert(3);
        subtree.insert(2);
        subtree.insert(4);
        System.out.println(tree.preOrder(subtree.root));
        System.out.println(tree.isSubtree(tree.root, subtree.root));

    }
}

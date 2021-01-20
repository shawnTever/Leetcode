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

    TreeNode root;

    private void insertTree(TreeNode root, TreeNode x) {
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


    public String inOrder(TreeNode tree) {
        if (tree != null) {
            String leftStr = inOrder(tree.left);
            String rightStr = inOrder(tree.right);
            return (leftStr.isEmpty() ? leftStr : leftStr + " " ) + tree.val
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }

    public String preOrder(TreeNode tree) {
        if (tree != null) {
            String leftStr = preOrder(tree.left);
            String rightStr = preOrder(tree.right);
            return tree.val + (leftStr.isEmpty() ? leftStr : " " + leftStr)
                    + (rightStr.isEmpty() ? rightStr : " " + rightStr);
        }
        return "";
    }


}

public class offer26_isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) &&
                (recursive(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    private boolean recursive(TreeNode A, TreeNode B) {
        if (B == null) return true;
        else if (A == null || A.val != B.val) return false;
        return recursive(A.left, B.left) && recursive(A.right, B.right);
    }
}

public class offer33_verifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return recursive(postorder, 0, postorder.length - 1);
    }

    private boolean recursive(int[] postorder, int i, int j) {
        if (i >= j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] > postorder[j]) p++;
        return p == j && recursive(postorder, i, m - 1)
                && recursive(postorder, m, j - 1);
    }

    public static void main(String[] args) {
        int[] postorder = new int[]{1, 2, 5, 10, 6, 9, 4, 3};
        offer33_verifyPostorder verifyPostorder = new offer33_verifyPostorder();
        System.out.println(verifyPostorder.verifyPostorder(postorder));

    }
}

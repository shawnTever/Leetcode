import java.util.HashMap;
import java.util.Map;

public class _106_buildTreePost {
    Map<Integer, Integer> map = new HashMap();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return recursive(postorder, inorder, 0, postorder.length - 1,
                0, inorder.length - 1);
    }

    private TreeNode recursive(int[] postorder, int[] inorder,
                               int postLeft, int postRight,
                               int inLeft, int inRight) {
        if (postLeft > postRight) return null;
        else {
            TreeNode root = new TreeNode(postorder[postRight]);
            int pIndex = map.get(root.val);
            root.left = recursive(postorder, inorder,
                    postLeft, pIndex - inLeft + postLeft -1,
                    inLeft, pIndex - 1);
            root.right = recursive(postorder, inorder,
                    pIndex - inLeft +postLeft, postRight - 1,
                    pIndex + 1, inRight - 1);
            return root;
        }
    }
    public static void main(String[] args) {
        _106_buildTreePost buildTree = new _106_buildTreePost();
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        TreeNode root = buildTree.buildTree(inorder, postorder);
        System.out.println(root.preOrder(root));
    }
}

import java.util.HashMap;
import java.util.Map;

public class _105_offer07_buildTree {

    Map<Integer, Integer> map = new HashMap();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return recursive(preorder, inorder, 0, preorder.length - 1,
        0, inorder.length - 1);
    }

    private TreeNode recursive(int[] preorder, int[] inorder,
                               int preLeft, int preRight,
                               int inLeft, int inRight) {
        if (preLeft > preRight) return null;
        else {
            TreeNode root = new TreeNode(preorder[preLeft]);
            int pIndex = map.get(root.val);
            root.left = recursive(preorder, inorder,
                    preLeft + 1, preLeft + pIndex - inLeft,
                    inLeft, pIndex - 1);
            root.right = recursive(preorder, inorder,
                    preLeft + pIndex - inLeft + 1, preRight,
                    pIndex + 1, inRight);
            return root;
        }
    }

    public static void main(String[] args) {
        _105_offer07_buildTree buildTree = new _105_offer07_buildTree();
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        int[] postorder = new int[]{9,15,7,20,3};
        TreeNode root = buildTree.buildTree(preorder, inorder);
        System.out.println(root.preOrder(root));
    }
}

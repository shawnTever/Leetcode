import java.util.ArrayList;
import java.util.List;

public class _102_offer32_levelOrder {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root != null) recursive(root, 0);
        return result;
    }

    private List<List<Integer>> recursive(TreeNode root, int level) {

        if (result.size() == level) {
            List<Integer> layer = new ArrayList<>();
            result.add(layer);
        }
        result.get(level).add(root.val);
        if (root.left != null) {
            recursive(root.left, level + 1);
        }
        if (root.right != null) {
            recursive(root.right, level + 1);
        }

        return result;
    }
}

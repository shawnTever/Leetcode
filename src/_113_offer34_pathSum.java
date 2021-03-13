import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _113_offer34_pathSum {
    List<List<Integer>> result = new ArrayList<>();
    Stack<Integer> sub = new Stack<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return result;
        recursive(root, targetSum);
        return result;
    }

    private void recursive(TreeNode root, int targetSum) {
        if (root.left == null && root.right == null) {
            Stack<Integer> a = (Stack<Integer>) sub.clone();
            a.push(root.val);
            targetSum -= root.val;
            if (targetSum == 0) result.add(a);
        }
        else {
            sub.push(root.val);
            targetSum -= root.val;
            if (root.left != null) recursive(root.left, targetSum);
            if (root.right != null) recursive(root.right, targetSum);
            sub.pop();
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.root = root;
        root.insert(7);
        root.insert(5);
        root.insert(8);
        root.insert(3);
        root.insert(6);
        root.insert(12);
        root.insert(11);
        root.insert(14);
        System.out.println(root.preOrder(root));
        _113_offer34_pathSum pathSum = new _113_offer34_pathSum();
        System.out.println(pathSum.pathSum(root, 25));
    }
}

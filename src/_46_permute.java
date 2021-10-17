import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _46_permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        List<Integer> subNums = new ArrayList<>();
        List<Integer> element = new ArrayList<>();
        for (int num : nums)
            subNums.add(num);
        dnf(subNums, permute, 0, element);
        return permute;
    }

    public void dnf (List<Integer> subNums, List<List<Integer>> permute, int index, List<Integer> element) {
        if (subNums.size() == 0) {
            permute.add(element);
        }
        else {
            for (int i = 0; i < subNums.size(); i++) {
                List<Integer> ele = new ArrayList<>(element);
                ele.add(subNums.get(i));
                List<Integer> list = new ArrayList<>(subNums);
                list.remove(i);
                dnf (list, permute, index + 1, ele);
            }
        }
    }

    public static void main(String[] args) {
        _46_permute _46_permute = new _46_permute();
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> permute = _46_permute.permute(nums);
        for (List<Integer> p : permute) {
            System.out.println(p.toString());
        }
    }
}

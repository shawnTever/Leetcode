import java.util.*;

public class _46_permute {
//    全排列
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
//    全排列字符串
    public List<String> permute(String s) {
        List<String> ans = new ArrayList<>();
        if (s == null || s.length() == 0) return ans;
        char[] str = s.toCharArray();
        ArrayList<Character> rest = new ArrayList<>();
        for (char ch : str)
            rest.add(ch);
        String path = "";
        dnf(rest, path, ans);
        return ans;
    }

    public void dnf(ArrayList<Character> rest, String path, List<String> ans) {
        if (rest.isEmpty()) ans.add(path);
        else {
            int n = rest.size();
            for (int i = 0; i < n; i++) {
                char cur = rest.get(i);
                rest.remove(i);
                dnf(rest, path + cur, ans);
                rest.add(i, cur);
            }
        }
    }

//    字符串所有子序列
    public List<String> permute1(String s) {
        char[] str = s.toCharArray();
        String path = "";
        Set<String> set = new HashSet<>();
        dnf(str, 0, set, path);
        return new ArrayList<>(set);
    }

//    path为之前决定不能改变的序列
//    str[index]还未决定的序列
//    Set去重
    public void dnf(char[] str, int index, Set<String> ans, String path) {
        if (index == str.length) {
            ans.add(path);
            return;
        }
//        没要index位置字符
        dnf(str, index + 1, ans, path);
//        要index位置字符
        dnf(str, index + 1, ans, path + String.valueOf(str[index]));
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

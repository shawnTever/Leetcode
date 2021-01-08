import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class offer03_findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        HashSet set = new HashSet();
        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            }
            else {
                set.add(i);
            }
        }
        return -1;
    }

}

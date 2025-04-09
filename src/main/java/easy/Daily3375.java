package easy;

import java.util.HashSet;
import java.util.Set;

public class Daily3375 {
    public int minOperations(int[] nums, int k) {

        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            if (i < k) return -1;
            if (i != k) s.add(i);
        }

        return s.size();
    }
}

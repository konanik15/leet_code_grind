package medium;

import java.util.HashSet;

public class Daily2799 {
    public int countCompleteSubarrays(int[] nums) {
        var s = new HashSet<Integer>();
        var c = 0;

        for (int i : nums) {
            s.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            var currentSet = new HashSet<Integer>();
            currentSet.add(nums[i]);
            if (currentSet.containsAll(s)) c++;
            for (int j = i + 1; j < nums.length; j++) {
                currentSet.add(nums[j]);
                if (currentSet.containsAll(s)) c++;
            }
        }

        return c;
    }
}

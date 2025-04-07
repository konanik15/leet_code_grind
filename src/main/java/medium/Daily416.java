package medium;

import java.util.Arrays;
import java.util.HashSet;

public class Daily416 {
    public boolean canPartition(int[] nums) {
        var sum = Arrays.stream(nums).sum();

        if (sum % 2 == 1) return false;
        var target = sum / 2;
        var dp = new HashSet<Integer>();
        dp.add(0);

        for (int i = nums.length - 1; i >= 0; i--) {
            var dpCopy = new HashSet<Integer>();
            for (Integer j : dp) {
                int currSum = j + nums[i];
                if (currSum == target) return true;
                if (j > target) continue;
                dpCopy.add(j);
                if (currSum > target) continue;
                dpCopy.add(currSum);
            }
            dp = dpCopy;
        }
        return false;
    }
}

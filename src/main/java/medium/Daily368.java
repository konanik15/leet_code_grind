package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Daily368 {
    private int[] nums;
    private int[] dp;
    private int[] prev;

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        this.nums = nums;
        dp = new int[nums.length];
        prev = new int[nums.length];
        Arrays.fill(dp, -1);
        Arrays.fill(prev, -1);

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == -1) dfs(i);
            if (dp[i] > dp[maxIndex]) maxIndex = i;
        }

        List<Integer> result = new ArrayList<>();
        while (maxIndex != -1) {
            result.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        Collections.reverse(result);
        return result;
    }

    private int dfs(int i) {
        if (dp[i] != -1) return dp[i];
        dp[i] = 1;
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] % nums[i] == 0) {
                int current = 1 + dfs(j);
                if (current > dp[i]) {
                    dp[i] = current;
                    prev[i] = j;
                }
            }
        }
        return dp[i];
    }
}

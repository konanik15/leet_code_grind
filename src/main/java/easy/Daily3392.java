package easy;

public class Daily3392 {
    public int countSubarrays(int[] nums) {
        var c = 0;
        for (int i = 2; i < nums.length; i++) {
            if (2 * (nums[i - 2] + nums[i]) == nums[i - 1]) c++;
        }

        return c;
    }
}

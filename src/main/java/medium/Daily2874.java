package medium;

public class Daily2874 {

    public long maximumTripletValue(int[] nums) {
        long prefixMax = nums[0];
        long maxDiff = 0;
        long result = -1;


        for (int k = 1; k < nums.length; k++) {
            result = Math.max(result, maxDiff * nums[k]);
            prefixMax = Math.max(prefixMax, nums[k]);
            maxDiff = Math.max(maxDiff, prefixMax - nums[k]);
        }

        return result;
    }
}

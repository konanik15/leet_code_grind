package easy;

public class Daily2873 {

    // O(n)= n^3
    public long maximumTripletValueBruteForce(int[] nums) {

        long val = -1;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    val = Math.max(val, getValue(nums[i], nums[j], nums[k]));
                }
            }
        }

        return val >= 0 ? val : 0;
    }

    private long getValue(long i, long j, long k) {
        return (i - j) * k;
    }
}

package easy;

public class Daily2176 {
    public int countPairs(int[] nums, int k) {
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += (nums[i] == nums[j] && (i * j % k == 0)) ? 1 : 0;
            }
        }
        return count;
    }
}

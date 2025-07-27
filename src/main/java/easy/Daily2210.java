package easy;

public class Daily2210 {
    public int countHillValley(int[] nums) {
        var sum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (isHillOnLeft(i, nums) == isHillOnRight(i, nums)) sum++;
        }
        return sum;
    }

    private int isHillOnRight(int i, int[] nums) {
        for (int r = i + 1; r < nums.length; r++) {
            // if next is same as current there is no point in going further
            if (nums[r] == nums[i]) return 4;
            // if next is hill return 1
            if (nums[r] > nums[i]) return 1;
                // if next is valley return 0
            else if (nums[r] < nums[i]) return 0;
        }
        return 4;
    }

    private int isHillOnLeft(int i, int[] nums) {
        for (int l = i - 1; l >= 0; l--) {
            // if prev is hill return 1
            if (nums[l] > nums[i]) return 1;
                // if prev is valley return 0
            else if (nums[l] < nums[i]) return 0;
        }
        return 3;
    }
}

package medium;

public class Daily75 {
    public int[] sortColors(int[] nums) {

        var zeros = 0;
        var ones = 0;
        var two = 0;
        for (int num : nums) {
            if (num == 0) zeros++;
            if (num == 1) ones++;
            if (num == 2) two++;
        }

        for (int i = 0; i < zeros; i++) {
            nums[i] = 0;
        }
        for (int i = zeros; i < ones + zeros; i++) {
            nums[i] = 1;
        }
        for (int i = ones + zeros; i < ones + zeros + two; i++) {
            nums[i] = 2;
        }

        return nums;
    }
}

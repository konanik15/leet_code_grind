package medium;

import java.util.Arrays;

public class Daily2401 {

    public int longestNiceSubarray(int[] nums) {
        int[] lastBit = new int[32];
        Arrays.fill(lastBit, -1);
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            int currentLeft = left;

            for (int bit = 0; bit < 32; bit++) {
                if ((num >> bit & 1) == 1) {
                    if (lastBit[bit] >= currentLeft) {
                        currentLeft = Math.max(currentLeft, lastBit[bit] + 1);
                    }
                }
            }

            left = currentLeft;

            for (int bit = 0; bit < 32; bit++) {
                if ((num >> bit & 1) == 1) {
                    lastBit[bit] = right;
                }
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

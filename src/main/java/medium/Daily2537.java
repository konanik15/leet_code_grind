package medium;

import java.util.HashMap;
import java.util.Map;

public class Daily2537 {

    public long countGood(int[] nums, int k) {
        long count = 0L;
        long currPairs = 0;
        Map<Integer, Integer> m = new HashMap<>();


        var l = 0;
        var r = -1;
        while (l < nums.length) {
            var currentNumber = 0;
            long previousSum;
            long newSum;
            boolean moreNumbers = false;
            if (currPairs < k && r < nums.length - 1) {
                r++;
                currentNumber = nums[r];
                previousSum = m.containsKey(currentNumber) ? getSumOfPairs(m.get(currentNumber)) : 0;
                m.merge(currentNumber, 1, Integer::sum);
                newSum = getSumOfPairs(m.get(currentNumber));
                moreNumbers = true;
            } else {
                if (currPairs >= k) {
                    count += nums.length - r;
                }
                currentNumber = nums[l];
                previousSum = m.containsKey(currentNumber) ? getSumOfPairs(m.get(currentNumber)) : 0;
                m.merge(nums[l], 1, (i1, i2) -> i1 - i2);
                newSum = getSumOfPairs(m.get(currentNumber));
                l++;
            }

            if (moreNumbers) {
                currPairs += (newSum - previousSum);
            } else {
                currPairs -= (previousSum - newSum);
            }
        }

        return count;
    }

    private long getSumOfPairs(long noo) {
        return noo == 2 ? 1 : noo * (noo - 1) / 2;
    }
}

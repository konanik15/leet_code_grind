package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Daily2780 {

    public int minimumIndex(List<Integer> nums) {

        Map<Integer, Integer> numberPerOccurrence = new HashMap<>();

        for (Integer number : nums) {
            numberPerOccurrence.merge(number, 1, Integer::sum);
        }

        int dominantAmount = 0;
        int dominantNumber = 0;

        for (Integer key : numberPerOccurrence.keySet()) {
            if (numberPerOccurrence.get(key) > dominantAmount) {
                dominantAmount = numberPerOccurrence.get(key);
                dominantNumber = key;
            }
        }

        int left = 0;
        int right = dominantAmount;

        for (int i = 0; i < nums.size(); i++) {
            var currNumber = nums.get(i);
            if (currNumber == dominantNumber) {
                left += 1;
                right -= 1;
            }
            if (isDominant(left * 2, i + 1) && isDominant(right * 2, nums.size() - i - 1)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isDominant(int multipliedOccurrences, int size) {
        return multipliedOccurrences > size;
    }
}

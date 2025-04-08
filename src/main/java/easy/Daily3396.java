package easy;

import java.util.HashMap;

public class Daily3396 {
    public int minimumOperations(int[] nums) {
        int duplicateIndex = -1;
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                duplicateIndex = Math.max(m.get(nums[i]), duplicateIndex);
            }
            m.put(nums[i], i);
        }
        if (duplicateIndex == -1) return 0;
        duplicateIndex++;
        return duplicateIndex % 3 == 0 ? duplicateIndex / 3 : (duplicateIndex % 3 == 1 ? (duplicateIndex + 2) / 3 : (duplicateIndex + 1) / 3);
    }
}

package easy;

import java.util.HashMap;

public class Daily1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var secondIndex = map.get(target - nums[i]);
            if (secondIndex != null) {
                return new int[]{secondIndex, i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution found"); // (1)
    }
}

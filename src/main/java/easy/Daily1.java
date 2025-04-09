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
        return new int[]{map.get(target - nums[nums.length - 1]), nums.length - 1};
    }
}

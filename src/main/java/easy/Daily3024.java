package easy;

import data_structures.enums.TriangleType;

public class Daily3024 {
    public String triangleType(int[] nums) {
        return canFormTriangle(nums) ? String.valueOf(getTriangleType(nums)).toLowerCase() : "none";
    }

    private TriangleType getTriangleType(int[] nums) {
        if (nums[0] == nums[1] && nums[1] == nums[2]) return TriangleType.EQUILATERAL;
        else if (nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) return TriangleType.ISOSCELES;
        else return TriangleType.SCALENE;
    }

    private boolean canFormTriangle(int[] nums) {
        return nums[0] + nums[1] > nums[2] && nums[0] + nums[2] > nums[1] && nums[1] + nums[2] > nums[0];
    }
}

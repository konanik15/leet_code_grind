package easy;

public class Daily1920 {

    public int[] buildArray(int[] nums) {
        var arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}

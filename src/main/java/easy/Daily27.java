package easy;

public class Daily27 {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] == val) continue;
            else {
                nums[i] = nums[j];
                i++;
                counter++;
            }
        }
        return counter;
    }
}

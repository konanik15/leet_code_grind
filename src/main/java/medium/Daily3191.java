package medium;

import java.util.Arrays;

public class Daily3191 {

    public int minOperations(int[] nums) {
        int numberOfOperations = 0;
        for(int l =0;l < nums.length-2;l++){
            if(nums[l] == 0) numberOfOperations += flip(l,nums);
            else if(nums[l+1] == 0 ) {
                numberOfOperations += flip(l+1,nums);
                l+=1;
            }
            else if( nums[l+2] == 0) {
                numberOfOperations += flip(l+2,nums);
                l+=2;
            }
        }
        return Arrays.stream(nums).anyMatch(value -> value==0) ? -1 : numberOfOperations;
    }

    private int flip(int l, int[] nums) {
        if(l+2 >= nums.length){
            return  0;
        }
        else {
            nums[l] = nums[l] == 0 ? 1 :0;
            nums[l+1] = nums[l+1] == 0 ? 1 :0;
            nums[l+2] = nums[l+2] == 0 ? 1 :0;
            return 1;
        }
    }
}

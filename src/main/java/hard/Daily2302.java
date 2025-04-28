package hard;

public class Daily2302 {

    public long countSubarrays(int[] nums, long k) {
        var c = 0L;
        long sum = nums[0];

        for (int right = 0, left = 0; right < nums.length && left < nums.length; ) {
            long length = right - left + 1;
            long product = sum * length;

            if (product >= k) {
                sum -= nums[left];
                left++;
            } else {
                if (right >= left) c += length;
                right++;
                if (right < nums.length) sum += nums[right];
            }
        }
        return c;
    }


    // brute force
    // public long countSubarrays(int[] nums, long k) {
    //
    //     var c = 0L;
    //
    //     for(int i=0;i<nums.length;i++){
    //         long currentSum = nums[i];
    //         long currentMultiplier = 1L;
    //         if(currentSum < k) c++;
    //         for(int j = i+1;j<nums.length;j++){
    //             currentSum += nums[j];
    //             currentMultiplier++;
    //
    //             if(currentSum * currentMultiplier < k) c++;
    //         }
    //     }
    //     return  c;
    // }
}

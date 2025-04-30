package easy;

import java.util.Arrays;

public class Daily1295 {
    public int findNumbers(int[] nums) {
        return (int) Arrays.stream(nums).mapToObj(String::valueOf).filter(s -> s.length() % 2 == 0).count();
    }
}

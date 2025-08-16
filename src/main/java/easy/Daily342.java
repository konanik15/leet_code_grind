package easy;

public class Daily342 {
    public boolean isPowerOfFour(int n) {
        var current = 1;
        for (int i = 1; i < 31; i++) {
            if (current == n) return true;
            else if (current > n) return false;
            current *= 4;
        }
        return false;
    }
}

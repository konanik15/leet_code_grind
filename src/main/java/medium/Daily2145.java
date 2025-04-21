package medium;

public class Daily2145 {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        var lowest = 0L;
        var highest = 0L;
        var current = 0L;
        for (int i : differences) {
            current += i;
            lowest = Math.min(current, lowest);
            highest = Math.max(current, highest);
        }
        var range = highest - lowest;
        var minAllowedRange = upper - lower;
        return minAllowedRange < range ? 0 : (int) (minAllowedRange - range + 1);
    }
}

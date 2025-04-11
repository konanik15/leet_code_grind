package easy;

public class Daily2943 {

    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) count++;
        }
        return count;
    }

    private boolean isSymmetric(int i) {
        var s = String.valueOf(i);
        if (s.length() % 2 == 1) return false;
        var firstHalf = s.substring(0, s.length() / 2);
        var secondHalf = s.substring(s.length() / 2);

        return getDecimalValue(firstHalf) == getDecimalValue(secondHalf);
    }

    private int getDecimalValue(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}

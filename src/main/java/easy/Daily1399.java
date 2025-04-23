package easy;

import java.util.HashMap;

public class Daily1399 {

    public int countLargestGroup(int n) {

        var m = new HashMap<Integer, Integer>();
        var biggestSize = 0;
        for (int i = 1; i <= n; i++) {
            var sumOfDigits = 0;
            for (char c : String.valueOf(i).toCharArray()) {
                sumOfDigits += Character.getNumericValue(c);
            }
            m.merge(sumOfDigits, 1, Integer::sum);
            biggestSize = Math.max(biggestSize, m.get(sumOfDigits));
        }
        int finalBiggestSize = biggestSize;
        return (int) m.values().stream().filter(integer -> integer == finalBiggestSize).count();
    }
}

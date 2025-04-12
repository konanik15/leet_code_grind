package hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Daily3272 {

    private long kPalindromes = 0;
    private final Set<Long> done = new HashSet<>();
    private final long[] fact = new long[11];

    public long countGoodIntegers(int n, int k) {
        precomputeFactorial();

        StringBuilder number = new StringBuilder().append(" ".repeat(Math.max(0, n)));

        generatePalindromes(0, n, number, k);

        return kPalindromes;
    }

    private void precomputeFactorial() {
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i <= 10; i++) {
            fact[i] = i * fact[i - 1];
        }
    }

    private void generatePalindromes(int pos, int n, StringBuilder number, int k) {
        if (pos >= (n + 1) / 2) {
            String numStr = number.toString();
            if (isKPalindrome(numStr, k)) kPalindromes += allArrangements(numStr, n);
            return;
        }
        char start = (pos == 0) ? '1' : '0';
        while (start <= '9') {
            number.setCharAt(pos, start);
            number.setCharAt(n - pos - 1, start);
            generatePalindromes(pos + 1, n, number, k);
            start++;
        }
    }

    private boolean isKPalindrome(String numStr, int k) {
        return Long.parseLong(numStr) % k == 0;
    }

    private long allArrangements(String numStr, int n) {
        char[] numArray = numStr.toCharArray();
        Arrays.sort(numArray);
        String sorted = new String(numArray);

        long num = Long.parseLong(sorted);
        if (done.contains(num)) return 0;

        done.add(num);

        int[] freq = new int[10];
        for (char c : sorted.toCharArray()) freq[c - '0']++;
        long totalPermutations = countAllPermutations(freq, n);
        long invalidPermutations = 0;
        if (freq[0] > 0) {
            freq[0]--;
            invalidPermutations = countAllPermutations(freq, n - 1);
        }

        return totalPermutations - invalidPermutations;
    }

    private long countAllPermutations(int[] freq, int n) {
        long count = fact[n];
        for (int i = 0; i <= 9; i++) {
            count /= fact[freq[i]];
        }

        return count;
    }
}

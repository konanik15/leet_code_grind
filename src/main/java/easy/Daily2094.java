package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class Daily2094 {

    public int[] findEvenNumbers(int[] digits) {
        var output = new ArrayList<Integer>();
        var frequency = new HashMap<Character, Integer>();

        for (int n : digits) {
            var currentDigits = String.valueOf(n).toCharArray()[0];
            frequency.merge(currentDigits, 1, Integer::sum);
        }

        for (int i = 100; i < 999; i += 2) {
            var currentDigits = String.valueOf(i).toCharArray();
            var map = new HashMap<Character, Integer>();
            for (char c : currentDigits) {
                map.merge(c, 1, Integer::sum);
            }
            boolean contains = true;
            for (char c : map.keySet()) {
                if (!(frequency.containsKey(c) && frequency.get(c) >= map.get(c))) contains = false;
            }
            if (contains) output.add(i);

        }

        return output.stream().mapToInt(i -> i).toArray();
    }
}

package easy;

import java.util.TreeMap;

public class Daily3442 {
    public int maxDifference(String s) {
        var m = new TreeMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            m.merge(c, 1, Integer::sum);
        }
        var biggestOdd = m.values().stream().filter(integer -> integer % 2 == 1).max(Integer::compareTo).get();
        var biggestEven = m.values().stream().filter(integer -> integer % 2 == 0).min(Integer::compareTo).get();

        return biggestOdd - biggestEven;
    }
}

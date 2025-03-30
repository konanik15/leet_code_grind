package medium;

import java.util.*;

public class Daily763 {

    public List<Integer> partitionLabels(String s) {
        var output = new ArrayList<Integer>();
        Map<Character, Integer> m = new HashMap<>();
        var chars = s.toCharArray();
        int currentSize = 0;

        for (char c : chars) {
            m.merge(c, 1, Integer::sum);
        }

        Map<Character, Integer> current = new HashMap<>();

        for (char aChar : chars) {
            current.merge(aChar, 1, Integer::sum);
            currentSize += 1;
            if (currentIsIncludedInAll(current, m)) {
                output.add(currentSize);
                currentSize = 0;
                current = new HashMap<>();
            }
        }

        return output;
    }

    private boolean currentIsIncludedInAll(Map<Character, Integer> current, Map<Character, Integer> m) {
        for (char c : current.keySet()) {
            if (!Objects.equals(current.get(c), m.get(c))) return false;
        }
        return true;
    }
}

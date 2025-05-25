package medium;

import java.util.HashMap;

public class Daily2131 {
    public int longestPalindrome(String[] words) {
        var occurrenceMap = new HashMap<String, Integer>();
        var counter = 0;
        for (String word : words) {
            var opposite = new StringBuilder((word)).reverse().toString();
            if (occurrenceMap.containsKey(opposite)) {
                counter += 4;
                var occurrenceOpposite = occurrenceMap.get(opposite);
                if (occurrenceOpposite > 1) {
                    occurrenceMap.merge(opposite, -1, Integer::sum);
                } else occurrenceMap.remove(opposite);
            } else {
                occurrenceMap.merge(word, 1, Integer::sum);
            }
        }

        var anyPalindrome = occurrenceMap.keySet().stream().filter(s -> s.charAt(0) == s.charAt(1)).findAny();
        return anyPalindrome.isPresent() ? counter + 2 : counter;
    }
}

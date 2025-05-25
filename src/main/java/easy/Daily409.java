package easy;

import java.util.HashMap;

public class Daily409 {
    public int longestPalindrome(String s) {
        var occurrenceMap = new HashMap<Character, Integer>();
        var counter = 0;
        for (char character : s.toCharArray()) {
            if (occurrenceMap.containsKey(character)) {
                counter += 2;
                var occurrenceOpposite = occurrenceMap.get(character);
                if (occurrenceOpposite > 1) {
                    occurrenceMap.merge(character, -1, Integer::sum);
                } else occurrenceMap.remove(character);
            } else {
                occurrenceMap.merge(character, 1, Integer::sum);
            }
        }

        var anySingleChar = occurrenceMap.keySet().stream().findFirst();

        return anySingleChar.isPresent() ? counter + 1 : counter;
    }
}

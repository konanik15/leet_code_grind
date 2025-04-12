package medium;

import java.util.HashSet;
import java.util.Set;

public class Daily3 {

    public int lengthOfLongestSubstring(String s) {
        int biggestSize = 0;
        Set<Character> set = new HashSet<>();
        char[] string = s.toCharArray();
        for (int i = 0, j = 0; j < s.length(); j++) {
            char currentChar = string[j];
            if (set.contains(currentChar)) {
                for (; i < j; i++) {
                    if (string[i] != currentChar) set.remove(string[i]);
                    else {
                        i++;
                        break;
                    }
                }
            } else {
                set.add(currentChar);
            }
            biggestSize = Math.max(biggestSize, j - i + 1);
        }

        return biggestSize;
    }

}

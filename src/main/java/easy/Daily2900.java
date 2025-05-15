package easy;

import java.util.ArrayList;
import java.util.List;

public class Daily2900 {

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        var currentGroup = groups[0];
        var a = new ArrayList<String>();
        a.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (currentGroup != groups[i]) {
                a.add(words[i]);
                currentGroup = groups[i];
            }
        }
        return a;
    }

}

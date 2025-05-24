package easy;

import java.util.ArrayList;
import java.util.List;

public class Daily2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) list.add(i);
        }

        return list;
    }
}

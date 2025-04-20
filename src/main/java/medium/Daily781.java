package medium;

import java.util.HashMap;

public class Daily781 {
    public int numRabbits(int[] answers) {
        var m = new HashMap<Integer, Integer>();
        var c = 0;
        for (int answer : answers) {
            m.merge(answer, 1, Integer::sum);
        }
        for (int i : m.keySet()) {
            var o = m.get(i);
            if (i == 0) c += o;
            else {
                var s = i + 1;
                var mod = o % s;
                c += mod == 0 ? o : o + s - mod;
            }
        }
        return c;
    }
}

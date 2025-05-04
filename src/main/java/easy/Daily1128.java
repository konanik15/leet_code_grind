package easy;

import java.util.HashMap;

public class Daily1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        var c = 0;

        record Domino(int a, int b) {
            @Override
            public boolean equals(Object o) {
                if (o == null || getClass() != o.getClass()) return false;
                Domino domino = (Domino) o;
                return (a == domino.a && b == domino.b) || (a == domino.b && b == domino.a);
            }

            @Override
            public int hashCode() {
                int result = a;
                result = 31 * result + 31 * b;
                return result;
            }
        }

        var m = new HashMap<Domino, Integer>();

        for (int[] domino : dominoes) {
            var d = new Domino(domino[0], domino[1]);
            if (m.containsKey(d)) c += m.get(d);
            m.merge(d, 1, Integer::sum);
        }

        return c;
    }
}

package hard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Daily2551 {
    public long putMarbles(int[] weights, int k) {
        List<Long> possibleEdges = new ArrayList<>();
        if (weights.length == k || k == 1) return 0;

        for (int i = 0; i < weights.length - 1; i++) {
            possibleEdges.add((long) (weights[i] + weights[i + 1]));
        }
        possibleEdges.sort(Comparator.reverseOrder());
        int splits = k - 1;


        return possibleEdges.subList(0, splits).stream().reduce(Long::sum).get() - possibleEdges.subList(possibleEdges.size() - splits, possibleEdges.size()).stream().reduce(Long::sum).get();
    }
}

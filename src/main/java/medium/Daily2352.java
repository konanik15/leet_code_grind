package medium;

import java.util.*;

public class Daily2352 {


    public int equalPairs(int[][] grid) {
        Map<List<Integer>, Integer> rows = new HashMap<>();
        int counter = 0;
        for (int[] row : grid) {
            rows.merge(Arrays.stream(row).boxed().toList(), 1, Integer::sum);
        }
        List<List<Integer>> columns = new ArrayList<>();

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid.length; x++) {
                if (y == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(grid[y][x]);
                    columns.add(list);
                } else {
                    columns.get(x).add(grid[y][x]);
                }
            }
        }
        for (List<Integer> row : rows.keySet()) {
            counter += columns.stream().filter(s -> s.equals(row)).toList().size() * rows.get(row);
        }

        return counter;
    }
}

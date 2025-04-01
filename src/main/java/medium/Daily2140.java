package medium;


import java.util.Arrays;

public class Daily2140 {
    public long mostPoints(int[][] questions) {
        long[] cache = new long[questions.length];
        Arrays.fill(cache, -1);
        return dfs(0, questions, cache);
    }


    private long dfs(int i, int[][] questions, long[] cache) {
        if (i >= questions.length) return 0;
        if (cache[i] != -1) return cache[i];
        cache[i] = Math.max(dfs(i + 1, questions, cache), questions[i][0] + dfs(i + 1 + questions[i][1], questions, cache));
        return cache[i];
    }
}

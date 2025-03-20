package hard;

import java.util.Arrays;
import java.util.Comparator;

public class Daily3108 {


    public static class UnionFind {
        private final int[] parent;
        private final int[] andValue;

        public UnionFind(int size) {
            parent = new int[size];
            andValue = new int[size];
            Arrays.fill(andValue, -1); // Initially, components have no edges (all bits set)
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int i) {
            if (parent[i] != i) {
                parent[i] = find(parent[i]); // Path compression
            }
            return parent[i];
        }

        public void union(int u, int v, int w) {
            int rootU = find(u);
            int rootV = find(v);
            if (rootU == rootV) {
                // Merge the edge into the existing component
                andValue[rootU] &= w;
            } else {
                // Merge rootV into rootU's component
                parent[rootV] = rootU;
                // Update the AND value of the new component
                andValue[rootU] = andValue[rootU] & andValue[rootV] & w;
            }
        }

        public int getAndValue(int node) {
            return andValue[find(node)];
        }

    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        UnionFind uf = new UnionFind(n);


        Arrays.sort(edges, Comparator.comparingInt(o -> o[0]));

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            uf.union(u, v, w);
        }

        int[] result = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            int s = query[i][0];
            int t = query[i][1];
            if (s == t) {
                int andVal = uf.getAndValue(s);
                result[i] = andVal;
            } else {
                if (uf.find(s) != uf.find(t)) {
                    result[i] = -1;
                } else {
                    result[i] = uf.getAndValue(s);
                }
            }

        }
        return result;
    }
}

package com.example.graphs;

public class QuickUnionCompressionPath {

    private final int[] root;
    private final int[] rank;

    public QuickUnionCompressionPath(int size) {
        root = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {

        //tecnique to update the roots during the find
        if (x == root[x]) {
            return x;
        }

        root[x] = find(root[x]);
        return root[x];

    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}

package com.example.graphs;

public class QuickUnionByRank {

    private final int[] root;
    private final int[] rank;

    public QuickUnionByRank(int size) {
        root = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        int curr = x;

        while (curr != root[curr]) {
            curr = root[curr];
        }

        return curr;
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {

            //tecnique to try to keep the tree balanced

            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;

            } else if (rank[rootY] > rank[rootX]) {
                root[rootX] = rootY;

            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }

        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}

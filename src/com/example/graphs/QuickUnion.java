package com.example.graphs;

public class QuickUnion {

    private final int[] root;

    public QuickUnion(int size) {
        root = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;
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
            root[rootY] = rootX;
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickUnion qu = new QuickUnion(10);

        qu.union(1, 2);
        qu.union(2, 5);
        qu.union(5, 6);
        qu.union(6, 7);
        qu.union(3, 8);
        qu.union(8, 9);

        assert(qu.connected(1, 5)); // true
        assert(qu.connected(5, 7)); // true
        assert(!qu.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        qu.union(9, 4);
        assert(qu.connected(4, 9)); // true

    }
}

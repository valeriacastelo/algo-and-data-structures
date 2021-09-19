package com.example.graphs;

public class QuickFind {

    private final int[] root;

    public QuickFind(int size) {
        root = new int[size];

        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int x) {
        return root[x];
    }

    public void union(int x, int y) {

        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            root[y] = rootX;
            updateRoots(rootY, rootX);
        }

    }

    private void updateRoots(int oldRoot, int newRoot) {

        for (int i = 0; i < root.length; i++) {
            if (root[i] == oldRoot) {
                root[i] = newRoot;
            }
        }

    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);

        qf.union(1, 2);
        qf.union(2, 5);
        qf.union(5, 6);
        qf.union(6, 7);
        qf.union(3, 8);
        qf.union(8, 9);

        assert(qf.connected(1, 5)); // true
        assert(qf.connected(5, 7)); // true
        assert(!qf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        qf.union(9, 4);
        assert(qf.connected(4, 9)); // true

    }

}

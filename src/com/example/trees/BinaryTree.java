package com.example.trees;

public class BinaryTree {
    protected Node root;

    public void insert(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;

        } else {
            Node curr = root;

            while (true) {
                if (curr.left == null) {
                    curr.left = newNode;
                    break;
                }

                if (curr.right == null) {
                    curr.right = newNode;
                    break;
                }

                curr = curr.left;
            }
        }

    }

    @Override
    public String toString() {
        return "{root: " + root + '}';
    }

}

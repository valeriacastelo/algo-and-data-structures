package com.example.trees;

public class BinarySearchTree {
    protected Node root;

    public void insert(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;

        } else {
            Node curr = root;

            while (true) {
                if (val < curr.val) {
                    //left
                    if (curr.left == null) {
                        curr.left = newNode;
                        break;
                    }
                    curr = curr.left;
                } else {
                    //right
                    if (curr.right == null) {
                        curr.right = newNode;
                        break;
                    }
                    curr = curr.right;
                }
            }
        }

    }

    @Override
    public String toString() {
        return "{root: " + root + '}';
    }

    public static void main(String[] args) {

        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        System.out.println(tree);

    }

}

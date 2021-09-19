package com.example.trees;

public class Node {

    protected int val;
    protected Node left;
    protected Node right;

    protected Node(int val) { this.val = val; }

    @Override
    public String toString() {
        return "{val: " + val +
                ", left: " + left +
                ", right: " + right +
                "}";
    }

}

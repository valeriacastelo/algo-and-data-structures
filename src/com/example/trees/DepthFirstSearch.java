package com.example.trees;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearch {

    public void traverseInorder(Node node, List<Integer> list) {

        if (node.left != null) {
            traverseInorder(node.left, list);
        }

        list.add(node.val);

        if (node.right != null) {
            traverseInorder(node.right, list);
        }

    }

    public void traversePreorder(Node node, List<Integer> list) {

        list.add(node.val);

        if (node.left != null) {
            traversePreorder(node.left, list);
        }

        if (node.right != null) {
            traversePreorder(node.right, list);
        }

    }

    public void traversePostorder(Node node, List<Integer> list) {

       if (node.left != null) {
           traversePostorder(node.left, list);
       }

        if (node.right != null) {
            traversePostorder(node.right, list);
        }

       list.add(node.val);

    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();

        //=========Inorder
        BinaryTree treeForInorder = new BinaryTree();
        treeForInorder.insert(4);
        treeForInorder.insert(2);
        treeForInorder.insert(5);
        treeForInorder.insert(1);
        treeForInorder.insert(3);
        List<Integer> listInorder = new ArrayList<>();

        dfs.traverseInorder(treeForInorder.root, listInorder);
        System.out.println(listInorder);

        //=========Preorder
        BinaryTree treeForPreorder = new BinaryTree();
        treeForPreorder.insert(1);
        treeForPreorder.insert(2);
        treeForPreorder.insert(5);
        treeForPreorder.insert(3);
        treeForPreorder.insert(4);
        List<Integer> listPreorder = new ArrayList<>();

        dfs.traversePreorder(treeForPreorder.root, listPreorder);
        System.out.println(listPreorder);

        //=========Postorder
        BinaryTree treeForPostorder = new BinaryTree();
        treeForPostorder.insert(5);
        treeForPostorder.insert(3);
        treeForPostorder.insert(4);
        treeForPostorder.insert(1);
        treeForPostorder.insert(2);
        List<Integer> listPostorder = new ArrayList<>();

        dfs.traversePostorder(treeForPostorder.root, listPostorder);
        System.out.println(listPostorder);

    }

}

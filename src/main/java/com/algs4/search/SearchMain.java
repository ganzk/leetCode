package com.algs4.search;

import com.algs4.search.bintree.BinarySearchTree;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.ST;

import java.util.Iterator;

public class SearchMain {

    public static void main(String[] args) {

        BinarySearchTree BST = new BinarySearchTree();
        BST.put(1,"hello");
        String s = BST.get(1);
        System.out.println(s);
//        RedBlackBST

    }

}

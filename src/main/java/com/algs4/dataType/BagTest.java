package com.algs4.dataType;

import edu.princeton.cs.algs4.Bag;

import java.util.Iterator;

public class BagTest {


    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.add("jjjj");
        bag.add("pppp");
        boolean empty = bag.isEmpty();
        System.out.println(empty);
        int size = bag.size();
        System.out.println(size);
        Iterator iterator = bag.iterator();
        iterator.remove();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}

package com.dahua.graph.minimumTree;

/**
 * 最小生成树
 */
public class MiniSpanTree {

    public static void main(String[] args) {

//        Prim.miniSpanTree(new AdjacentMatrix());

        Kruskal.miniSpanTree(new AdjacentMatrix());

    }

}

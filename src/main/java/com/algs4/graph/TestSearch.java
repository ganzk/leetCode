package com.algs4.graph;

import com.algs4.graph.bfs.BreadthFirstTraverse;

public class TestSearch {

    public static void main(String[] args) {

        Graph G = new Graph(6);
        G.addEdge(0,3);
        G.addEdge(0,1);
        G.addEdge(1,2);
        G.addEdge(4,5);

        // region 深度优先搜索
//        DepthFirstSearch DFS = new DepthFirstSearch(G,4);
//        System.out.println(DFS.marked(5));
//        System.out.println(DFS.count());

        // 寻找路径
//        DepthFirstPaths DFP = new DepthFirstPaths(G,2);
//        Iterable<Integer> integers = DFP.pathTo(3);
//        for (int w:integers) System.out.print(w + " ");
//        System.out.println();
        // endregion

        // region 广度优先搜索
        BreadthFirstTraverse bfs = new BreadthFirstTraverse();
        bfs.bfs(G);
        // endregion


    }

}

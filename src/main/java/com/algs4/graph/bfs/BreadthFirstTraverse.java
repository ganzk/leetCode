package com.algs4.graph.bfs;

import com.algs4.graph.Graph;

import java.util.Iterator;

/**
 * 广度优先搜索 - 遍历
 */
public class BreadthFirstTraverse {

    public void bfs(Graph G){

        // 首先需要一个数组
        boolean[] end = new boolean[G.V()];

        for (int i = 0; i < end.length; i++) {
            if(!end[i]){
                System.out.println(i);
                end[i] = true;
            }
            Iterable<Integer> adj = G.adj(i);
            Iterator<Integer> iterator = adj.iterator();
            while (iterator.hasNext()){
                Integer next = iterator.next();
                if(!end[next]){
                    System.out.println(next + " ");
                    end[next] = true;
                }
            }
        }

    }

}

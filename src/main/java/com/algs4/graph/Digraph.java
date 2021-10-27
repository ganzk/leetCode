package com.algs4.graph;

import edu.princeton.cs.algs4.Bag;

import java.util.Iterator;

/**
 * 有向图
 */
public class Digraph {

    // 顶点数目
    private final int V;
    // 边的数目
    private int E;
    // 用来存放所有的结点  是int类型
    // 每一个Bag里面的链表是用来存放边的
    // 下标是结点
    private Bag<Integer>[] adj;

    // 创建邻接表
    public Digraph(int V) {
        this.V = V;
        this.E = 0;
        // 创建邻接表
        adj = (Bag<Integer>[]) new Bag[V];
        // 将所有链表初始化为空
        for (int v = 0; v < V; v++) adj[v] = new Bag<Integer>();

    }

    public int V() { return V; }

    public int E() { return E; }

    public void addEdge(int v, int w) {
        // 因为是有向图  将w添加到v的链表中
        adj[v].add(w);
        E ++;
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    // 获取该图的反向图
    public Digraph reverse(){

        Digraph reDigraph = new Digraph(this.V);
        for (int i = 0; i < this.V; i++) {
            Iterable<Integer> adj = this.adj(i);
            Iterator<Integer> iterator = adj.iterator();

            while (iterator.hasNext()){
                Integer next = iterator.next();
                reDigraph.addEdge(next,i);
            }
        }
        return reDigraph;
    }

}

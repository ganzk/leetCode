package com.algs4.graph;

import edu.princeton.cs.algs4.Bag;

/**
 * 无向图
 * 邻接表 表示
 */
public class Graph {

    // 顶点数目
    private final int V;
    // 边的数目
    private int E;
    // 用来存放所有的结点  是int类型
    // 每一个Bag里面的链表是用来存放边的
    // 下标是结点
    Bag<Integer>[] adj;

    // 创建邻接表
    public Graph(int V) {
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
        adj[v].add(w); // 将w添加到v的链表中
        adj[w].add(v); // 将v添加到w的链表中
        E ++;
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

}

package com.dahua.graph.minimumTree;

public class Edge {

    // 开始结点
    public int begin;

    // 结束结点
    public int end;

    // 权值
    public int weight;

    public Edge(int begin, int end, int weight) {
        this.begin = begin;
        this.end = end;
        this.weight = weight;
    }
}

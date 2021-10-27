package com.dahua.graph;

import java.util.List;

/**
 * 顶点
 */
public class Vertex {

    // 链接的顶点
    List<Vertex> vertexList;

    // 是否已经访问
    boolean visited;

    // 数据
    int value;

    public Vertex(List<Vertex> vertexList, boolean visited) {
        this.vertexList = vertexList;
        this.visited = visited;
    }
    public Vertex() {
    }
}

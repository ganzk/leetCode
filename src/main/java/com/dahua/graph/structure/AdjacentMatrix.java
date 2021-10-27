package com.dahua.graph.structure;

import com.dahua.graph.CommonVertex;

/**
 * 邻接矩阵
 */
public class AdjacentMatrix {

    // 顶点表
    CommonVertex[] commonVertices = {};

    // 邻接矩阵，用来存放顶点和弧
    public int[][] vertices = {
            {0,10,25535,25535,25535,11,25535,25535,25535}, // v0
            {10,0,18,25535,25535,25535,16,25535,12},  // v1
            {25535,25535,0,22,25535,25535,25535,25535,8},  // v2
            {25535,25535,22,0,20,25535,25535,16,21},  // v3
            {25535,25535,25535,20,0,26,25535,7,25535},  // v4
            {11,25535,25535,25535,26,0,17,25535,25535},  // v5
            {25535,16,25535,25535,25535,17,0,19,25535},  // v6
            {25535,25535,25535,16,7,25535,19,0,25535},  // v7
            {25535,12,8,21,25535,25535,25535,25535,0},  // v8
    };

    public int numVertexes = 9;

}

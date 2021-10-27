package com.dahua.graph.minimumTree;


public class Kruskal {

    public  static void miniSpanTree(AdjacentMatrix G){

        int i, n, m;

        // 定义边集数组
        Edge[] edges;

        // 定义一数组用来判断边与边是否形成环路
        int[] parent = new int[G.numVertexes];

        // 将邻接矩阵G转化为边集数组edges 并按权由小到大排序的代码
        edges = getEdges1(G);

        for (i = 0; i < G.numVertexes; i++) {
            // 初始化数组值为0
            parent[i] =  0;
        }


        // 循环每一条边
        for (i = 0; i < edges.length; i++) {
            n = Find(parent, edges[i].begin);
            m = Find(parent, edges[i].end);
            // 假如n与m不等，说明此边没有与现有生成树形成环路
            if (n != m) {
                // 将此边的结尾顶点放入下标为起点的parent中 表示此顶点已经在生成树集合中 
                parent[n] = m;
                System.out.println(edges[i].begin + " " + edges[i].end + " " + edges[i].weight);
            }
        }

    }

    // 查找连线顶点的尾部下标
    private static int Find(int[] parent, int f) {
        while (parent[f] > 0){
            f = parent[f];
        }
        return f;
    }

    // 转换为边集数组
    public Edge[] getEdges(AdjacentMatrix G){

        Edge[] edges = new Edge[15];

        int[] flag = new int[15];

        for (int i = 0; i < G.numVertexes; i++) {
            for (int j = 0; j < G.numVertexes; j++) {
                if(G.vertices[i][j] != 0 && G.vertices[i][j] != 25535){
                    Edge edge = new Edge(i,j,G.vertices[i][j]);
                }
            }
        }

        return null;
    }


    // 边集数组
    public static Edge[] getEdges1(AdjacentMatrix G){

        Edge[] edges = new Edge[15];

        int[] ints = {
                4,7,7,2,8,8,0,1,10,
                0,5,11,1,8,12,3,7,16,
                1,6,16,5,6,17,1,2,18,
                6,7,19,3,4,20,3,8,21,
                2,3,22,3,6,24,4,5,26
        };

        for (int i = 0; i < 15 * 3; ) {
            Edge edge = new Edge(ints[i],ints[i +1],ints[i +2]);
            int k = i + 1;
            edges[k/3] = edge;
            i = i + 3;
        }

//        for (int i = 0; i < edges.length; i++) {
//            System.out.println(edges[i].begin + " "+ edges[i].end + " " + edges[i].weight);
//        }

        return edges;
    }

}

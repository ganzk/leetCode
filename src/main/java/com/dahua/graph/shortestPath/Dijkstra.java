package com.dahua.graph.shortestPath;

public class Dijkstra {

    // 用于存储最短路径下标的数组
    static int[] patharc = new int[9];
    // 用于存储到各点最短路径的权值和
    static int[] ShortPathTable = new int[9];

    // Dijkstra算法，求有向网G的v0顶点到其余顶点v最短路径P[v]及带权长度D[v]
    // P[v]的值为前驱顶点下标，D[v]表示v0到v的最短路径长度和
    public static void shortestPath(ShortPathGraph G, int v0, int[] P, int[] D){

        int v, w, k = 0, min;
        /* final[w]=1表示求得顶点v0至vw的最短路径 */
        int[] fina = new int[9];
        /* 初始化数据 */
        for (v = 0; v < G.numVertexes; v++) {
            /* 全部顶点初始化为未知最短路径状态 */
            fina[v] = 0;
            /* 将与v0点有连线的顶点加上权值 */
            D[v] = G.vertices[v0][v];
            /* 初始化路径数组P为-1 */
            P[v] = 0;
        }

        // v0至v0路径为0
        D[v0] = 0;
        // v0至v0不需要求路径
        fina[v0] = 1;

        // 开始主循环，每次求得v0到某个v顶点的最短路径
        for (v = 1; v < G.numVertexes; v++) {

            /* 当前所知离v0顶点的最近距离 */
            min=25535;
            /* 寻找离v0最近的顶点 */
            for (w = 0; w < G.numVertexes; w++) {
                if (!(fina[w] == 1) && D[w] < min) {
                    k=w;
                    /* w顶点离v0顶点更近 */
                    min = D[w];
                }
            }
            /* 将目前找到的最近的顶点置为1 */
            fina[k] = 1;

            /* 修正当前最短路径及距离 */
            for (w = 0; w < G.numVertexes; w++) {
                /* 如果经过v顶点的路径比现在这条路径的长度短的话 */
                if (!(fina[w] == 1) && (min + G.vertices[k][w] < D[w])) {
                    /* 说明找到了更短的路径，修改D[w]和P[w] */
                    /* 修改当前路径长度 */
                    D[w] = min + G.vertices[k][w];
                    P[w]=k;
                }
            }
        }

        for (int i = 0; i < ShortPathTable.length; i++) {
            System.out.println(i + " " + ShortPathTable[i]);
        }



    }

    public static void main(String[] args) {
        shortestPath(new ShortPathGraph(),0,patharc,ShortPathTable);
    }

}

package com.dahua.graph.minimumTree;

/**
 * 普里姆算法
 */
public class Prim {

    public  static void miniSpanTree(AdjacentMatrix G){

        int min, i, j, k;

        int[] adjvex = new int[G.numVertexes]; /* 保存相关顶点间边的权值 */
        int[] lowcost = new int[G.numVertexes]; /* 初始化第一个权值为0，即v0加入生成树 */
        /* lowcost的值为0，在这里就是此下标的顶点已经加入生成树 */
        // 初始化第一个顶点下标为0
        lowcost[0] = 0;
        // 循环除下标为0外的全部顶点
        adjvex[0] = 0;

        // 将v0顶点与之有边的权值存入数组
        for (i = 1; i < G.numVertexes; i++) {
            lowcost[i] = G.vertices[0][i];
            adjvex[i] = 0;
        }

        for (i = 1; i < G.numVertexes; i++) {
            // 初始化最小权值为∞，通常设置为不可能的大数字如32767 65535等
            min = 65535;
            j = 1;
            k = 0;

            // 不用遍历[0,0]
            // 先横向的遍历每一个顶点
            // 循环全部顶点
            while (j < G.numVertexes){
                // 如果权值不为0且权值小于min
                if (lowcost[j] !=0 && lowcost[j] < min){
                    // 则让当前权值成为最小值
                    min = lowcost[j];
                    // 将当前最小值的下标存入k
                    k = j;
                }
                j++;
            }
            // 打印当前顶点边中权值最小边
            System.out.println(adjvex[k] +" " + k);
            // 将当前顶点的权值设置为0，表示此顶点已经完成任务
            lowcost[k] = 0;

            // 纵向遍历每一行的k点的结点是否有最短
            // 循环所有顶点
            for (j = 1; j < G.numVertexes; j++){
                // 若下标为k顶点各边权值小于此前这些顶点未被加入生成树权值
                if (lowcost[j] != 0 && G.vertices[k][j] < lowcost[j]){
                    // 将较小权值存入lowcost
                    lowcost[j] = G.vertices[k][j];
                    // 将下标为k的顶点存入adjvex
                    adjvex[j] = k;
                    
                }
            }
        }
    }

}

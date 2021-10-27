package com.algs4.graph.dfs;

/**
 * 图的搜索
 * 1.深度优先搜索
 * 2.广度优先搜索
 */
public interface Search {

    /**
     * v跟s是否联通
     * @param v
     * @return
     */
    boolean marked(int v);

    /**
     * 与s联通的顶点数，所有结点是否跟它联通，对于连通图来说，返回值等于所有节点；
     * @return
     */
    int count();


}

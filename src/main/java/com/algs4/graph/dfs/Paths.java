package com.algs4.graph.dfs;

/**
 * 深度优先搜索-寻找路径
 */
public interface Paths {

    /**
     * 是否存在s到v的路径
     * @param v
     * @return
     */
    boolean hasPathTo(int v);

    /**
     * s到v的路径，如果不存在返回null；
     * @param v
     * @return
     */
    Iterable<Integer> pathTo(int v);

}

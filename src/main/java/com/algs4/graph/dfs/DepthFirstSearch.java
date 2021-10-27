package com.algs4.graph.dfs;

import com.algs4.graph.Graph;

/**
 * 深度优先搜索
 */
public class DepthFirstSearch implements Search {

    // 主要思想是，走到一个点就记录下来，
    // 然后然后根据这个点继续往前走，如果走到距离过的点，就返回上一个点
    private boolean[] marked;
    //
    private int count;

    // 构造函数接受一个起点s作为参数，计算s到与s连通的每个顶点之间的路径。
    public DepthFirstSearch(Graph G, int s) {
        // true代表结点已经访问，下标便是结点
        marked = new boolean[G.V()];
        // 构造函数直接会遍历一遍这个结点所在的流通图
        dfs(G, s);
    }
    private void dfs(Graph G, int v) {
        // 当前节点已访问
        marked[v] = true;
        count++;
        // 主要的就是 G.adj(v) 这是一个顶点，里边存档这与之连接的顶点
        // 因为Bag实现了Iterable迭代器，所以可以用加强for循环来遍历Bag里面的数据
        for (int w : G.adj(v))
            if (!marked[w]) dfs(G, w);
    }
    public boolean marked(int w) { return marked[w]; }
    public int count() { return count; }


}

package com.algs4.graph.dfs;

import com.algs4.graph.Graph;
import edu.princeton.cs.algs4.Stack;

/**
 * 深度优先搜索-寻找路径
 */
public class DepthFirstPaths implements Paths {

    // 记录是否走过这个结点
    private boolean[] marked;

    // 先表示结点，数组的值记录走到这个结点的上一个访问的结点，
    // 比如访问的顺序是 2 -》1 那么在edgeTo[1]的位置为2
    // 其实这个数组记录着走过的路线，
    private int[] edgeTo;

    // 起点
    private final int s;

    // 构造函数接受一个起点s作为参数，
    public DepthFirstPaths(Graph G, int s) {
        this.s = s;
        // true代表结点已经访问，下标便是结点
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        // 构造函数直接会遍历一遍这个结点所在的流通图
        dfs(G, s);
    }

    private void dfs(Graph G, int v) {
        // 当前节点已访问
        marked[v] = true;

        for (int w : G.adj(v)) {
            if (!marked[w]) {
                // 存放是从哪个结点走到的w
                // edgeTo[w]=v表示v-w是第一次访问w时经过的边
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }

    public boolean hasPathTo(int w) {
        return marked[w];
    }

    public Iterable<Integer> pathTo(int v) {
        if(!hasPathTo(v)){
            return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        // i = edgeTo[i] 就是不断地去获取走过的上一个结点
        for (int i = v; i != s; i = edgeTo[i]) {
            // 从后往前放入栈中，取出来就是走过的路径了
            // 放入
            path.push(i);
        }
        // 最后放入起点
        path.push(s);
        return path;
    }


}

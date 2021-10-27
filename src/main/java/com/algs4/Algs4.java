package com.algs4;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 算法第四版
 * <dependency>
 *             <groupId>edu.princeton.cs</groupId>
 *             <artifactId>algs4</artifactId>
 *             <version>1.0.4</version>
 *         </dependency>
 */
public class Algs4 {

    /**
     * 示例
     * @param args
     */
    public static void main(String[] args) {

        int T = Integer.parseInt("50");
        VisualAccumulator a = new VisualAccumulator(T,1.0);
        for (int t = 0; t < T ;t ++){
            a.addDateValue(StdRandom.random());
        }
        StdOut.print(a);

    }

}

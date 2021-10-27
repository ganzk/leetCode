package com.algs4;

import edu.princeton.cs.algs4.StdDraw;

public class VisualAccumulator {
    private double total;
    private int N;
    public VisualAccumulator(int t, double max) {
        StdDraw.setXscale(0,t);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);
    }

    public void addDateValue(double random) {
        N ++;
        total += random;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,random);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);
    }
}

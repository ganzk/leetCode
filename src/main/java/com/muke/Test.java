package com.muke;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int maxSum = 0;
        int thisSum = 0;

        if(K > 0) {

            for(int i = 0; i < K; i++) {
                thisSum += in.nextInt();

                if(thisSum < 0)
                    thisSum = 0;
                else if(thisSum > maxSum)
                    maxSum = thisSum;
            }
        }

        System.out.println(maxSum);
    }

}

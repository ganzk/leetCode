package com.dahua.stack;

/**
 * 斐波那契数列(Fibonacci sequence)
 * 说如果兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。
 * 假设所有兔都不死，那么一年以后可以繁殖多少对兔子呢？我们拿新出生的一对小兔子分析一下：
 * 第一个月小兔子没有繁殖能力，所以还是一对；
 * 两个月后，生下一对小兔子数共有两对；
 * 三个月以后，老兔子又生下一对，因为小兔子还没有繁殖能力，所以一共是三对
 * ……依次类推
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368
 * 可以得出
 * F(n) = F(n-1) + F(n-2)
 *
 * 因为F(n-1)出生的小兔子是F(n-1) - F(n-2)，这些是不能繁殖的，所以能繁殖的只能是F(n-2)，再加上F(n-1)，就是F(n)所有的兔子；
 *
 * 类似的还有青蛙跳台阶
 *
 */
public class FibonacciTest {

    public static void main(String[] args) {
        System.out.println(test1(8));
    }

    /**
     * 递归
     * @param i
     * @return
     */
    public static int test1(int i){
        if(i == 0){
            return 0;
        }
        if(i == 1){
            return 1;
        }
        return test1(i -1) + test1(i -2);
    }

    /**
     * 迭代
     * @param i
     * @return
     */
    public static int test2(int i){
        for (int j = 2; j < i; j++) {

        }
        return 0;
    }

}

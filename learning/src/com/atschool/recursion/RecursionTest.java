package com.atschool.recursion;

import org.junit.Test;

/**
 * @author wms
 * @create 2021-04-15-11:12
 */
public class RecursionTest {

    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    //
    @Test
    public void test1(){
        int n = 1234;
        print(n);
    }
    public void print(int n){
        if (n > 9){
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    //递归求 1 + 2 + 3 + … + 10
    @Test
    public void test2(){
        System.out.println(sum(10));
    }
    public int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }

    //递归求 N 的阶乘(factorial)
    @Test
    public void test3(){
        System.out.println(factorial(15));
    }
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    //求斐波那契数列的第 N 项
    //0 1 1 2 3 5 8 13 21 34 55
    @Test
    public void test4(){
        System.out.println(fibonacci(11));
    }
    public int fibonacci(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //实现代码:求解汉诺塔问题(提示, 使用递归）
    @Test
    public void test5(){}

    // 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法？
    // 实现代码: 青蛙跳台阶问题(提示, 使用递归)
    @Test
    public void test6(){
        int n = 10;
        System.out.println("青蛙跳" + n + "级台阶总共有" + jumpStep(n) + "种跳法");
    }
    public int jumpStep(int n){
        if (n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        return jumpStep(n - 1) + jumpStep(n - 2);
    }
}

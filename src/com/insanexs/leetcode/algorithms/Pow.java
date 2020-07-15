package com.insanexs.leetcode.algorithms;

/**
 * @ClassName Pow
 * @Description Pow(x, n) #50 Medium
 * @Author xieshang
 * @Date 2020/7/15 9:15 上午
 */
public class Pow {

    public double myPow(double x, int n){
        return doPow(x, n);
    }

    private double doPow(double x, int n){
        if(n == 0 || x == 1){
            return 1;
        }else if(n == 1){
            return x;
        }

        if(n < 0){
            return (1/x) * doPow(1/x, -( n + 1)); //这步是处理负数溢出的关键，可以作为两步考虑 => 1/x * doPow(x, n + 1) => 1/x * doPow(1/x, -(n + 1))
        }else{
            return n % 2 == 0 ? doPow(x * x, n / 2) : x * doPow(x * x, n /2);
        }
    }


    public static void main(String[] args){
        System.out.println(new Pow().myPow(2, Integer.MIN_VALUE));
    }
}

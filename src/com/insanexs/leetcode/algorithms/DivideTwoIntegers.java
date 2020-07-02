package com.insanexs.leetcode.algorithms;

/**
 * @Author: xieshang
 * @Description: Divide Two Integers #29 (Medium)
 * @Date: Create at 2020-07-02
 */
public class DivideTwoIntegers {

    public static void main(String[] args){
        System.out.println(new DivideTwoIntegers().divide(10, 3));
        System.out.println(new DivideTwoIntegers().divide(7, -3));
        System.out.println(new DivideTwoIntegers().divide(Integer.MIN_VALUE, 2));
        System.out.println(new DivideTwoIntegers().divide(Integer.MIN_VALUE, 1));
        System.out.println(new DivideTwoIntegers().divide(Integer.MIN_VALUE, -1));
        System.out.println(new DivideTwoIntegers().divide(Integer.MIN_VALUE, -2));
        System.out.println(new DivideTwoIntegers().divide(1612541756, -2147483648));
        System.out.println(new DivideTwoIntegers().divide(-2147483648, -2147483648));
    }

    public int divide(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean isPositive =  (dividend >>> 31 ^ divisor >>> 31) == 0;

        long ldividend = Math.abs(new Long(dividend));
        long ldivisor = Math.abs(new Long(divisor));

        int ret = 0; long multi = ldivisor, tmpRet;

        while(ldividend >= ldivisor){
            tmpRet = 1;
            multi = ldivisor;
            while(ldividend > (multi<<1)){
                multi = multi << 1;
                tmpRet = tmpRet << 1;
            }

            ldividend -= multi;
            ret += tmpRet;

        }


        return isPositive? ret : -ret;
    }
}

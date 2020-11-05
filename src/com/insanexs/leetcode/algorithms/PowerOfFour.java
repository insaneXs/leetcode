package com.insanexs.leetcode.algorithms;

/**
 * @ClassName PowerOfFour
 * @Description Power of four #342 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int num){
        return num > 0 &&  ((num & (num - 1)) == 0) && (num & 0x55555555) == num;

    }

    public static void main(String[] args) {
        System.out.println(new PowerOfFour().isPowerOfFour(16));
    }
}

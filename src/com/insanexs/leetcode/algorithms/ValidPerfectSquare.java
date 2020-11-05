package com.insanexs.leetcode.algorithms;

/**
 * @ClassName ValidPerfectSquare
 * @Description Valid Perfect Square #367 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num){
        int i = 1;
        while(true){
            int ret = i * i;
            if(ret < 0 || ret > num){
                return false;
            }else if(ret == num){
                return true;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(16));
    }
}

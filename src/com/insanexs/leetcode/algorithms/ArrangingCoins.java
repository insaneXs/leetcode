package com.insanexs.leetcode.algorithms;

/**
 * @ClassName ArrangingCoins
 * @Description Arranging Coins #441 (Easy)
 * @Author xieshang
 * @Date 2020/11/6
 */
public class ArrangingCoins {
    public int arrangeCoins(int n){
        int sum = 0;
        int i = 0;
        while(sum <= n && sum >=0){
            i++;
            sum = sum + i;
        }

        return i;
    }
}

package com.insanexs.leetcode.algorithms;

/**
 * @ClassName GuessNumberHigherOrLower
 * @Description Guess Number Higher Or Lower #374（Easy）
 * @Author xieshang
 * @Date 2020/11/5
 */
public class GuessNumberHigherOrLower {

    class Solution extends GuessGame {
        public int guessNumber(int n){
            int lower = 1, higher = n;
            while(lower < higher - 1){
                int guessNum = (higher - lower) / 2 + lower;
                switch (guess(guessNum)){
                    case 0:
                        return guessNum;
                    case 1:
                        higher = guessNum;
                        break;
                    case -1:
                        lower = guessNum;
                        break;
                }
            }
            return guess(lower) == 0 ? lower : higher;
        }

    }

}
class GuessGame{
    int guess(int num){
        return 0;
    }
}

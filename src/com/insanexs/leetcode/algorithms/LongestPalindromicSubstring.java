package com.insanexs.leetcode.algorithms;

/**
 * @Author: xieshang
 * @Description: #5 (Medium)
 * @Date: Create at 2020-06-29
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args){
        System.out.println(longestPalindrome("ababd"));
        System.out.println(longestPalindrome("abbd"));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("ccc"));
    }


    public static String longestPalindrome(String s){
        if(s == null){
            return "";
        }
        char[] chars = s.toCharArray();
        int len = chars.length;

        while(len >= 1){
            for(int i=0; i+len<= chars.length; i++){
                if(isPalindrome(chars, i, i + len - 1)){
                    return new String(chars, i , len);
                }
            }
            len--;
        }
        return "";
    }


    public static boolean isPalindrome(char[] chars, int begin, int end){
        for(int i=0; i<=(end-begin)/2; i++){
            if(chars[begin + i] != chars[end - i]){
                return false;
            }
        }
        return true;
    }


}

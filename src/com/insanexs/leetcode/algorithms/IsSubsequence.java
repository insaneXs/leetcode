package com.insanexs.leetcode.algorithms;

/**
 * @ClassName IsSubsequence
 * @Description Is Subsequence #392 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t){
        if(s.length() > t.length()){
            return false;
        }

        int i=0, j=0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }

        return i == s.length();
    }
}

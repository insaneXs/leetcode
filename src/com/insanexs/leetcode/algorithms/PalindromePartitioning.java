package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PalindromePartitioning
 * @Description  Palindrome Partitioning #131 (Medium)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s){
        List<List<String>> ret = new ArrayList<>();

        if(s == null || s.length() == 0){
            return ret;
        }

        doPartition(s,0, s.length() - 1, new ArrayList<>(), ret);
        return ret;
    }


    private void doPartition(String s, int start, int end, List<String> list, List<List<String>> ret){
        if(start > end){
            ret.add(list);
            return;
        }
        for(int i=0; i<=(end-start); i++){
            if(isPalindrome(s, start, start + i)){
                List<String> newList = new ArrayList<>(list);
                newList.add(s.substring(start, start + i + 1));
                doPartition(s, start + i + 1, end, newList, ret);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end){
        int i= start, j = end;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromePartitioning pp = new PalindromePartitioning();

        System.out.println(pp.partition("abcabc"));
    }
}

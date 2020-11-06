package com.insanexs.leetcode.algorithms;

/**
 * @ClassName FindTheDifference
 * @Description TODO
 * @Author xieshang
 * @Date 2020/11/5
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t){
        if(s.length() == 0){
            return t.charAt(0);
        }
        int[] record = new int[26];

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';
            int oldV = record[idx];
            record[idx] = oldV + 1;
            idx = t.charAt(i) - 'a';
            oldV = record[idx];
            record[idx] = oldV - 1;
        }
        for(int i=0; i<record.length; i++){
            if(record[i] == -1){
                return (char)(i + 'a');
            }
        }
        return t.charAt(t.length() - 1);
    }
}

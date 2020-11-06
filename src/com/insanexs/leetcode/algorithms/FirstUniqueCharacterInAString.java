package com.insanexs.leetcode.algorithms;

/**
 * @ClassName FirstUniqueCharacterInAString
 * @Description First Unique Character InA String
 * @Author xieshang
 * @Date 2020/11/5
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s){
        if(s == null || s.length() == 0){
            return -1;
        }
        int[] record = new int[26];

        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            int index = chars[i] - 'a';
            int val = record[index];
            record[index] = val + 1;
        }

        for(int i=0; i<chars.length; i++){
            int index = chars[i] - 'a';
            if(record[index] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
    }
}

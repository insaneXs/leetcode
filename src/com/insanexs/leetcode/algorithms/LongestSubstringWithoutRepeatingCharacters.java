package com.insanexs.leetcode.algorithms;

import java.util.HashMap;

/**
 * @Author: xieshang
 * @Description: Leetcode #3 (Medium)
 * @Date: Create at 2020-06-28
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("au"));
    }

    protected static int lengthOfLongestSubstring(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, index = -1;
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length; i++){
            char c = chars[i];

            int tmp;
            if((tmp = map.getOrDefault(c, index)) > index){
                index = tmp;
            }else if(i - index >= maxLength){
                maxLength = i - index;
            }

            map.put(c, i);
        }
        return maxLength;
    }
}

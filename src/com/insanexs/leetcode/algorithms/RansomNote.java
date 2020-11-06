package com.insanexs.leetcode.algorithms;

import java.util.HashMap;

/**
 * @ClassName RansomNote
 * @Description Ransom Node #383 (Medium)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote == null || ransomNote.length() < 1){
            return true;
        }

        if(magazine == null || magazine.length() < 1){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] chars = magazine.toCharArray();
        for(int i=0; i<chars.length; i++){
            int val = map.getOrDefault(chars[i], 0);
            val++;
            map.put(chars[i], val);
        }

        chars = ransomNote.toCharArray();
        for(int i=0; i<chars.length; i++){
            Integer val = map.get(chars[i]);
            if(val == null || val == 0){
                return false;
            }
            val--;
            map.put(chars[i], val);
        }
        return true;
    }
}

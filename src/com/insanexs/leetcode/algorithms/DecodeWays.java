package com.insanexs.leetcode.algorithms;

/**
 * @ClassName DecodeWays
 * @Description Decode Ways #91 (Medium)
 * @Author xieshang
 * @Date 2020/7/20 6:47 下午
 */
public class DecodeWays {

    public int numDecodings(String s){
        if(s == null || s.length() == 0){
            return 0;
        }

        int resN = 1;
        int resM = 1;
        int res = 0;
        char[] chars = s.toCharArray();
        for(int i=chars.length - 1; i>=0; i--){
            res = (validChar(chars[i]) ? resN : 0) + (valid2Chars(chars, i) ? resM : 0);
            resM = resN;
            resN = res;
        }
        return res;
    }

    private boolean valid2Chars(char[] chars, int start){
        if(start >= chars.length - 1){
            return false;
        }
        if(chars[start] == '1'){
            return true;
        }else if(chars[start] == '2' && chars[start + 1] <= '6'){
            return true;
        }
        return false;
    }

    private boolean validChar(char c){
        return c != '0';
    }

    public static void main(String[] args){
        System.out.println(new DecodeWays().numDecodings("226"));
    }
}

package com.insanexs.leetcode.algorithms;

/**
 * @ClassName NumberOfSegmentsInAString
 * @Description Number of Segments in a String #434 (Medium)
 * @Author xieshang
 * @Date 2020/11/6
 */
public class NumberOfSegmentsInAString {

    public int countSegments(String s){
        int ret = 0;
        if(s == null || s.length() <= 0){
            return ret;
        }
        int pre = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == ' ' && s.charAt(pre) != ' '){
                ret++;
                pre = i;
            }else if(s.charAt(i) != ' ' && s.charAt(pre) == ' '){
                pre = i;
            }
        }
        return s.charAt(pre) != ' ' ? ret + 1 : ret;
    }

    public static void main(String[] args){
        // s == null
        // s == ""

        // s = " abc"

        // s = "a bc"

        // s = "abc "

        // s = "  abc"
    }
}

package com.insanexs.leetcode.algorithms;

import java.util.HashMap;

public class IsIsomorphic {
	public static void main(String[] args){
		System.out.println(isIsomorphic("aa", "ab"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character, Character> ();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i = 0; i < arr1.length; i++){
            if(map.containsKey(arr1[i])){
                if(map.get(arr1[i]) != arr2[i])
                    return false;
            }else{
                map.put(arr1[i],arr2[i]);
            }
        }
        return true;
    }
}

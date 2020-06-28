package com.insanexs.leetcode.algorithms;

import java.util.HashMap;

public class Anagram {
	public boolean isAnagram(String s, String t){
		if((s == null && t != null) || (s != null && t == null))
			return false;
		if(s== null && t == null)
			return true;
		
		char[] arr1 = s.toCharArray();
		char[] arr2 = t.toCharArray();
		if(arr1.length  != arr2.length)
			return false;
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		for(int i=0; i<arr1.length; i++){
			if(map1.get(arr1[i]) == null)
				map1.put(arr1[i], 1);
			else
				map1.put(arr1[i], map1.get(arr1[i]) + 1);
		}
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		for(int i=0; i<arr2.length; i++){
			if(map2.get(arr2[i]) == null)
				map2.put(arr2[i], 1);
			else
				map2.put(arr2[i], map2.get(arr2[i]) + 1);
		}
		return map1.equals(map2);
	}
}

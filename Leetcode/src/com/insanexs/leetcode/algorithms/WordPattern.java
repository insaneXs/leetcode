package com.insanexs.leetcode.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str){
		if(str == null || pattern == null)
			return false;
		String[] words = str.split(" ");
		if(words.length != pattern.length())
			return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Set<String> set = new HashSet<String>();
		for(int i=0; i<pattern.length(); i++){
			if(map.get(pattern.charAt(i)) != null)
				if(!words[map.get(pattern.charAt(i))].equals(words[i]))
					return false;
			set.add(words[i]);
			map.put(pattern.charAt(i), i);
		}
		return set.size() == map.size();
	}
	
	public static void main(String[] args){
		String pattern = "abba";
		String str = "dog cat cat fish";
		System.out.println(wordPattern(pattern, str));
	}
}

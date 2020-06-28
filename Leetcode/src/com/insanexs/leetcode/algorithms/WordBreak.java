package com.leetCode.oj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class WordBreak {
	/**
	 * Time limit exceed.
	 */
	public static boolean wordBreak(String s,Set<String> dict){
		Iterator<String> iterator = dict.iterator();
		String[] strs = new String[dict.size()];
		int index = 0;
		while(iterator.hasNext()){
			strs[index] = iterator.next();
			index++;
		}
		StringBuffer sb = new StringBuffer();
		StringBuffer buffer = new StringBuffer("(");
		for(String str : strs)
			buffer.append(str+"|");
		buffer.delete(buffer.length()-1, buffer.length());
		buffer.append(")*");
		for(int i=0; i<strs.length; i++){
			sb.append(buffer);
		}
		String regex = new String(sb);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}
	public static void main(String[] args){
		String s = "leetcode1";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code1");
		System.out.println(wordBreak(s,dict));
	}
}

package com.insanexs.leetcode.algorithms;

public class CountAndSay {
	public String countAndSay(int n){
		String ans = "1";
		for(int i = 0; i< n -1; i++){
			char[] chars = ans.toCharArray();
			int count = 1;
			int num = chars[0] - 48;
			StringBuffer sb = new StringBuffer();
			for(int j=1; j<chars.length; j++){
				if(num == (chars[j] - 48 )){
					count ++;
				}else{
					sb.append(count);
					sb.append(num);
					num = chars[j] - 48;
					count = 1;
				}
			}
			sb.append(count);
			sb.append(num);
			ans = sb.toString();
		}
		return ans;
	}
	public static void main(String[] args){
		System.out.println(new CountAndSay().countAndSay(5));
	}
}

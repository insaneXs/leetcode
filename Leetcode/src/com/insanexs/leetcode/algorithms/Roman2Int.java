package com.leetCode.oj;

public class Roman2Int {

	public static int romanToInt(String s){
		int ans = 0;
		char[] chars = s.toCharArray();
		for(int i=0; i<chars.length;i++){
			if(chars[i] == 'C'){
				if((i+1) < chars.length){
					if(chars[i+1] == 'D'|| chars[i+1] == 'M'){
						ans = ans - 100;
						continue;
					}
				}
				ans = ans + 100;
			}else if(chars[i] == 'X'){
				if ((i + 1) < chars.length) {
					if (chars[i + 1] == 'L' || chars[i + 1] == 'C') {
						ans = ans - 10;
						continue;
					}
				}
				ans = ans + 10;
			}else if(chars[i] == 'I'){
				if((i+1) < chars.length){
					if(chars[i+1] == 'V' || chars[i+1] == 'X'){
						ans = ans - 1;
						continue;
					}
				}ans++;
			}else if(chars[i] == 'M'){
				ans = ans + 1000;
			}else if(chars[i] == 'D'){
				ans = ans + 500;
			}else if(chars[i] == 'L'){
				ans = ans + 50;
			}else if(chars[i] == 'V'){
				ans = ans + 5;
			}
		}
		
		return ans;
	}
	public static void main(String[] args){
		System.out.println(romanToInt("MCMXCVI"));
	}
}

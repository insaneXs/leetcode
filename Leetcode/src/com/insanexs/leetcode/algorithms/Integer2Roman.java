package com.leetCode.oj;

public class Integer2Roman {
	public static String intToRoman(int num){
		StringBuffer sb = new StringBuffer();
		int T = num / 1000;
		for(int i=0; i<T; i++)
			sb.append("M");
		num = num % 1000;
		int H = num / 100;
		if(H == 9)
			sb.append("CM");
		else if(H >= 5){
			sb.append("D");
			while(H-5 > 0){
				sb.append("C");
				H--;
			}
		}else if(H == 4)
			sb.append("CD");
		else{
			while(H > 0){
				sb.append("C");
				H--;
			}
		}
		num = num % 100;
		int t = num / 10;
		if(t == 9)
			sb.append("XC");
		else if(t >= 5){
			sb.append("L");
			while(t-5 > 0){
				sb.append("X");
				t--;
			}
		}else if(t == 4){
			sb.append("XL");
		}else{
			while(t > 0){
				sb.append("X");
				t--;
			}
		}
		num = num % 10;
		if(num == 9)
			sb.append("IX");
		else if(num >= 5){
			sb.append("V");
			while(num-5 >0){
				sb.append("I");
				num--;
			}
		}else if(num == 4){
			sb.append("IV");
		}else{
			while(num > 0){
				sb.append("I");
				num--;
			}
		}
		return new String(sb);
	}
	public static void main(String[] arg){
		System.out.println(intToRoman(50));
	}
}

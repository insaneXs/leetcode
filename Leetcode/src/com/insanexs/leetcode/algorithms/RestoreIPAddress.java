package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddress {
	public static List<String> restoreIPAddress(String s){
		List<String> list = new LinkedList<String>();
		if(s.length() < 4 || s.length() > 12)
			return list;
		String s1,s2,s3,s4;
		Integer x1,x2,x3,x4;
		for(int i=1; i<=3;i++){
			s1 = s.substring(0, i);
			if(s1.startsWith("0") && i !=1)
				continue;
			x1 = Integer.parseInt(s1);
			if(x1 < 0 || x1 > 255)
				continue;
			for(int j=1;j<=3;j++){
				if(i+j > s.length())
					break;
				s2 = s.substring(i,i+j);
				if(s2.startsWith("0") && j !=1)
					continue;
				x2 = Integer.parseInt(s2);
				if(x2 < 0 || x2 > 255)
					continue;
				for(int k=1;k<=3;k++){
					if(i+j+k > s.length())
						break;
					s3 = s.substring(i+j, i+j+k);
					if(s3.startsWith("0") && k !=1)
						continue;
					x3 = Integer.parseInt(s3);
					if(x3 < 0 || x3 > 255)
						continue;
					if(i+j+k >= s.length())
						continue;
					s4 = s.substring(i+j+k, s.length());
					if(s4.startsWith("0") && s4.length() !=1)
						continue;
					x4 = Integer.parseInt(s4);
					if(x4 < 0 || x4 > 255)
						continue;
					list.add(new String(s1+"."+s2+"."+s3+"."+s4));
				}
			}
		}
		return list;
	}
	
	public static void main(String arg[]){
		System.out.println(restoreIPAddress("101023"));
	}
}

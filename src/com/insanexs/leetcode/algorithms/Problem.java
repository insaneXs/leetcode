package com.insanexs.leetcode.algorithms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Problem {
	
	public static void printString(String str){
//		int count = 0;
		String[] strs = str.split(" ");
//		List<String> list = Arrays.asList(strs);
//		Set<String> set = new LinkedHashSet<String>(list);
//		strs = set.toArray(new String[set.size()]);
		String[] newStr = new String[strs.length + 4];
		System.arraycopy(strs, 0, newStr, 0, strs.length);
		String[] subString;
		for(int i=0; i<strs.length;i++){
			subString = new String[5];
			subString[0] = newStr[i];
//			System.out.println("subString[0] = "+subString[0]);
			for(int j=i+1; j<strs.length + 1; j++){
				subString[1] = newStr[j];
//				System.out.println("subString[1] = "+subString[1]);
				for(int k =j+1; k<strs.length + 2; k++ ){
					subString[2] = newStr[k];
//					System.out.println("subString[2] = "+subString[2]);
					for(int l = k+1; l<strs.length + 3; l++){
						subString[3] = newStr[l];
//						System.out.println("subString[3] = "+subString[3]);
						for(int m = l+1; m< strs.length + 4;m++){
							subString[4] = newStr[m];
//							System.out.println("subString[4] = "+subString[4]);
							for(String s : subString){
								if(s != null)
									System.out.print(s);
							}
//							count++;
							System.out.println("");
							if(subString[4] == null)
								break;
						}
						if(subString[3] == null)
							break;
					}
					if(subString[2] == null)
						break;
				}
				if(subString[1] == null)
					break;
			}
			if(subString[0] == null)
				break;
		}
//		System.out.println(count);
	}
	public static void method(String str){
		int count = 0;
		String[] wordArray = str.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			StringBuilder SB = new StringBuilder();
			boolean isFirst = true;
			for (int index = 0; index < 5 && index + i < wordArray.length; index++) {
				if (isFirst == true) {
					SB.append(wordArray[index + i]);
					isFirst = false;
				} else {
					SB.append(" ");
					SB.append(wordArray[index + i]);
				}
				count++;
				System.out.println(SB.toString());
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.currentTimeMillis();
		printString("a b c d e ");
		System.out.println(System.currentTimeMillis() - time1);
		long time2 = System.currentTimeMillis();
		method("a b c d e");
		System.out.println(System.currentTimeMillis() - time2);

	}

}

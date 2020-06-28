package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows){
		if(numRows < 1)
			return null;
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		List<Integer> firstRow = new LinkedList<Integer>();
		firstRow.add(1);
		list.add(firstRow);
		for(int i=1; i<numRows; i++){
			List<Integer> innerList = new LinkedList<Integer>();
			List<Integer> preRow = list.get(i-1);
			for(int j=0; j<=i; j++){
				int x,y;
				if(j-1 < 0){
					x = 0;
				}else
					x = preRow.get(j - 1);
				if(j == preRow.size()){
					y = 0;
				}else
					y = preRow.get(j);
				innerList.add(x+y);
			}
			list.add(innerList);
		}
		return list;
	}
}

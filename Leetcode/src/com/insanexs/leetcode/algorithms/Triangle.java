package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	public static int minimumTotal(List<List<Integer>> triangle) {
      if(triangle == null || triangle.size() == 0)
    	  return 0;
      List<int[]> min = new ArrayList<int[]>();
      min.add(new int[]{triangle.get(0).get(0)});
      for(int i=1; i<triangle.size(); i++){
    	  int[] temp = new int[triangle.get(i).size()];
    	  for(int j=0; j<temp.length; j++){
    		  if(j - 1 < 0){
    			  temp[j] = min.get(i - 1)[0] + triangle.get(i).get(j);  
    		  }else if(j >= min.get(i - 1).length){
    			  temp[j] = min.get(i - 1)[j - 1] + triangle.get(i).get(j); 
    		  }else{
    			  temp[j] = triangle.get(i).get(j) + (min.get(i - 1)[j - 1] < min.get(i - 1)[j] ? min.get(i - 1)[j - 1] : min.get(i - 1)[j]); 
    		  }
    	  }
    	  min.add(temp);
      }
      for(int i=0; i<min.size(); i++){
    	  int[] a = min.get(i);
    	  System.out.println(Arrays.toString(a));
      }
      int[] arr =  min.get(triangle.size()-1);
      int ans = arr[0];
      for(int i=1; i<arr.length; i++){
    	  if(ans > arr[i])
    		  ans = arr[i];
      }
      return ans;
    }
	
	public static void main(String[] args){
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l1.add(-1);
		l2.add(2);
		l2.add(3);
		l3.add(1);
		l3.add(-1);
		l3.add(-1);
		list.add(l1);
		list.add(l2);
		list.add(l3);
		minimumTotal(list);
	}
}

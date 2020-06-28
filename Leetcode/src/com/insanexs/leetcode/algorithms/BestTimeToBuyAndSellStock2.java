package com.leetCode.oj;

import java.util.LinkedList;
import java.util.List;

public class BestTimeToBuyAndSellStock2 {
	public static int maxProfit(int[] prices){
		if(prices.length < 2)
			return 0;
		List<Integer> p = new LinkedList<Integer>();
		p.add(prices[0]);
		int pre = prices[0];
		for(int i=1; i<prices.length; i++){
			if(pre != prices[i]){
				p.add(prices[i]);
			}
			pre = prices[i];
		}
		int maxProfit = 0;
		List<Integer>  list = new LinkedList<Integer>();
		int prek = -1;
		int k = 0;
		for(int i=0; i<p.size()-1; i++){
			k = p.get(i+1) - p.get(i);
			if((prek * k) < 0 ){
				list.add(p.get(i));
			}
			prek = k;
		}
		if(k > 0)
			list.add(p.get(p.size()-1));
//		for(int i : list)
//			System.out.print(i+" ");
//		System.out.println();
		for(int i=0; i< list.size() -1; i=i+2){
//			System.out.println("i = "+ i);
			maxProfit = maxProfit + (list.get(i+1) - list.get(i));
//			System.out.println(maxProfit);
		}
		return maxProfit;
		
	}
	public static void main(String[] args){
		int[] A = {8,6,4,3,3,2,3,5,8,3,8,2,6};
		System.out.println(maxProfit(A));
	}
}

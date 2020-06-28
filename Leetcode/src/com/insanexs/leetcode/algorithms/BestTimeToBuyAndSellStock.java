package com.insanexs.leetcode.algorithms;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices){
		if(prices == null || prices.length < 2)
			return 0;
		int maxProfit = Integer.MIN_VALUE ,sum = 0;
		for(int i=1; i<prices.length; i++){
			sum = sum + prices[i] - prices[i - 1];
			maxProfit = Math.max(maxProfit, sum);
			sum = Math.max(sum, 0);
		}
		
		return maxProfit;
	}
}

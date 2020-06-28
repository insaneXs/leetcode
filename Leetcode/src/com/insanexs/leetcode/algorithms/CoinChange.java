package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
	//�ݹ�����
	public int coinChange(int[] coins, int amount){
		if(amount <= 0)
			return -1;
		Arrays.sort(coins);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
 		List<Integer> list = new ArrayList<Integer>();
 		coinChangeHelper(coins, amount, list, ans);
 		
 		if(ans.size() == 0)
 			return -1;
 		int max = Integer.MAX_VALUE;
 		for(List<Integer> l : ans){
 			if(max > l.size())
 				max = l.size();
 		}
 		return max;
	}
	
	private void coinChangeHelper(int[] coins, int amount, List<Integer> list, List<List<Integer>> ans){
		if(amount == 0){
			ans.add(new ArrayList<Integer>(list));
		}
		
		for(int i=coins.length -1; i>=0; i--){
			if(amount >= coins[i]){
				list.add(coins[i]);
				coinChangeHelper(coins, amount - coins[i], list, ans);
				list.remove(list.size() - 1);
			}
		}
	}
	
	//����
	public int coinChange1(int[] coins, int amount){
		if(amount < 0)
			return -1;
		else if(amount == 0)
			return 0;
		Arrays.sort(coins);
		int[] array = new int[amount + 1];
		Arrays.fill(array, -1);
		for(int i=0; i<coins.length; i++){
			if(coins[i] <= amount)
				array[coins[i]] = 1;
		}
		
		for(int i=1; i<=amount; i++){
			if(array[i] != -1)
				continue;
			int min = Integer.MAX_VALUE;
			for(int j=coins.length - 1; j>=0; j--){
				if(i - coins[j] >=0 && array[i - coins[j]] != -1){
					int temp = array[i - coins[j]] + 1;
					if(temp < min)
						min = temp;
					array[i] = min;
				}
			}
		}
		return array[amount];
	}
	
	public static void main(String[] args){
		int[] coins = {186,419,83,408};
		int amount = 6249;
		
		CoinChange c = new CoinChange();
		System.out.println(c.coinChange1(coins, amount));
	}
}

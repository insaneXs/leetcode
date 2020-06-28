package com.leetCode.oj;

import java.util.Stack;

public class Sqrt {
	public int sqrt(int x){
		Stack<Integer> stack = new Stack<Integer>();
		int ans = 0;
		do{
			int temp = x % 100;
			stack.push(temp);
			x = x / 100;
		}while(x != 0);
		int firstnum = stack.pop();
		int i = 0;
		for(; i*i <= firstnum; i++){
			
		}
		i--;
		ans = ans * 10 + i;
		int pre = firstnum - i * i;
		while(!stack.isEmpty()){
			int num = stack.pop();
			num = num + pre * 100;
			System.out.println("num = "+ num);
			int j = num / (ans * 20 ); //  ‘…Ã
			while(((ans * 20 + j)* j) > num){
				j--;
			}
			System.out.println("j = "+ j);
			pre = num -(ans * 20 + j) * j; // «Û”‡
			System.out.println("pre = "+pre);
			ans = ans * 10 + j;
			System.out.println("ans = "+ ans);
		}
		return ans;
	}
	public static void main(String[] args){
		System.out.println(new Sqrt().sqrt(2147395599));
	}
}

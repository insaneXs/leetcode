package com.insanexs.leetcode.algorithms;


public class LongestConsectiveSequence {
	public int longestConsectiveSequence(int[] num){
		int length = 1;
		int temL =1;
		sort(num,0,num.length-1);
		for(int i=0; i<num.length-1; i++){
			if((num[i] + 1 )== num[i+1]){
				temL++;
				System.out.println("temL = "+temL);
				continue;
			}else if(num[i] == num[i+1]){
				continue;
			}
			if(temL > length){
				System.out.println("tem = "+temL);
				length = temL;
			}
			System.out.println("--");
			temL = 1;
		}
		return (temL > length ? temL : length);
	}
	
	public void sort(int[] num,int left,int right){
		if(left < right){
			int mid = getMiddle(num,left,right);
			sort(num,left,mid-1);
			sort(num,mid+1,right);
		}
	}
	
	public int getMiddle(int[] num, int left,int right){
		int temp = num[left];
		while(left < right){
			while(num[right] >= temp && right > left){
				right--;
			}
			num[left] = num[right];
			while(num[left] <= temp && left < right){
				left++;
			}
			num[right] = num[left]; 
			}
		num[left] = temp;
		return left;
	}
	public static void main(String[] args){
//		int[] num = {4,2,3,9,1,0,5,8,6,5,7,11,53,835,356,2356,367,95,3533,2345,5343,4653,46,37,34};
		int[] num = {0,1,2,1};
//		new LongestConsectiveSequence().sort(num, 0, num.length -1);
		System.out.println(new LongestConsectiveSequence().longestConsectiveSequence(num));
		for(int i : num)
			System.out.print(i+" ");
	}
}

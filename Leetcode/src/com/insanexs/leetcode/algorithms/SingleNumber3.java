package com.insanexs.leetcode.algorithms;

/**
 * ��singleNumber���˼·��������������Ԫ�ض��ظ��������Σ�����һ��Ԫ�س���һ��ʱ
 * �� a ^ b = b ^ a, a ^ a = 0, 0 ^ a = a�����ʵõ�
 * ��ȫ��Ԫ��������㣬���ý����Ϊ����һ�ε�Ԫ��
 * 
 * ����˼·���Ƚ�ȫ��Ԫ�����һ�εó���ֵ��Ϊ����ֻ����һ�ε�Ԫ��a,b����ֵ��
 * ���ֵ�ĳ���1��һλ�ͱ�ʾa��b����ͬ��λ��
 * �ɸ��ݸ�λ�Ƿ�Ϊ1��Ԫ�ز����������,��ô���õ���������һ����a,b�ֿ����ظ���Ԫ����ͬһ�ߡ�
 * ���ɽ�����תΪ��һ��
 * @author xieshang
 */
public class SingleNumber3 {
	public int[] singleNumber(int[] nums){
		if(nums == null || nums.length < 2)
			return new int[0];
		int temp = 0;
		for(int i=0; i<nums.length; i++){
			temp ^= nums[i];
		}
		int index = 0;
		while(temp !=0){
			if(temp % 2 != 0)
				break;
			temp /= 2;
			index++;
		}
		int flag = 1 << index;
		int ans1 = 0, ans2 = 0;
		for(int i=0; i<nums.length; i++){
			if((nums[i] & flag) == 0){
				ans1 ^= nums[i];
			}else{
				ans2 ^= nums[i];
			}
		}
		return new int[]{ans1, ans2};
	}
}

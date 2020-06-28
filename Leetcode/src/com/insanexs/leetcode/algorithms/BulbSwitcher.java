package com.insanexs.leetcode.algorithms;

public class BulbSwitcher {
	//λ��n�ĵƿ��ش���ͬ��������������һ����
	//���ڳ���ƽ�������⣬�������ǳɶԳ��֣����ֻ���ܿ������鿪���ǿ���������
	public int bulbSwitcher(int n){
		if(n <= 0)
			return 0;
		
//		int num = 0;
//		for(int i=1; i<=n; i++){
//			if(i * i <= n)
//				num++;
//			else
//				break;
//		}
//		return num;
		return (int)Math.sqrt(n);
	}
	
	public static void main(String[] args){
		BulbSwitcher bs = new BulbSwitcher();
		System.out.println(bs.bulbSwitcher(999999));
	}
}

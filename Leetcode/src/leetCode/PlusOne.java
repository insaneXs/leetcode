package leetCode;

import java.util.Arrays;
import java.util.LinkedList;

public class PlusOne {
	public int[] plusOne(int[] digits){
		boolean needPlus = false;
		LinkedList<Integer> ans = new LinkedList<Integer>();
		if(digits == null || digits.length == 0)
			return null;
		int i = digits.length - 1;
		int num = ++digits[i];
		if(num == 10){
			needPlus = true;
			ans.add(0);
		}else{
			ans.add(num);
		}
		i--;
		for(; i>=0 ; i--){
			if(needPlus){
				num = ++digits[i];
				if(num == 10){
					needPlus = true;
					ans.add(0);
				}else{
					needPlus = false;
					ans.add(num);
				}
			}else{
				ans.add(digits[i]);
			}
		}
		if(needPlus)
			ans.add(1);
		int[] ansArray = new int[ans.size()];
		for(int j = ansArray.length - 1; j>=0; j--)
			ansArray[j] = ans.removeFirst();
		return ansArray;
	}
	public static void main(String[] args){
		int[] digits = {9};
		System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));
	}
}

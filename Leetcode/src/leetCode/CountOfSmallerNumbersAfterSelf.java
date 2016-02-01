package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
	
	//METHOD 1:Time Limit Exceeded 
	public List<Integer> countSmaller(int[] nums){
		List<Integer> ans = new ArrayList<Integer>();
		
		return ans;
	}
	
	public static void main(String[] args){
		int[] nums = {5, 2, 6, 1};
		CountOfSmallerNumbersAfterSelf c = new CountOfSmallerNumbersAfterSelf();
		System.out.println(Arrays.toString(c.countSmaller(nums).toArray()));
	}
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(candidates == null || candidates.length < 1 || target < 0)
			return res;
		Arrays.sort(candidates);
		List<Integer> list = new ArrayList<Integer>();
		helper(candidates,target,res,list,0,0);
		return res;
	}
	
	private void helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> list,int sum,int left){
		if(sum == target){
			res.add(new ArrayList<Integer>(list));
			return;
		}else if(sum > target){
			return;
		}
		for(int i=left; i<candidates.length; i++){
			if(i != left && list.contains(candidates[i]))
				continue;
			list.add(candidates[i]);
			sum += candidates[i];
			helper(candidates, target, res, list, sum,i);
			list.remove(list.size() - 1);
			sum -= candidates[i];
		}
	}
	
	public static void main(String[] args){
		int[] candidates = {2,3,6,7};
		System.out.println(new CombinationSum().combinationSum(candidates, 7));
	}
}

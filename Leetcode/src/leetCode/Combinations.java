package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(n < 1 || k < 1)
			return res;
		int[] S = new int[n];
		for(int i=0; i<n; i++)
			S[i] = i+1;
		List<Integer> sub = new ArrayList<Integer>();
		helper(k, 0, S, res, sub);
		return res;
	}
	private void helper(int k, int left, int[] S, List<List<Integer>> res, List<Integer> sub){
		if(sub.size() == k){
			res.add(new ArrayList<Integer>(sub));
			return;
		}
		for(int i=left; i<S.length;i++){
			sub.add(S[i]);
			helper(k, i+1, S, res, sub);
			sub.remove(sub.size() - 1);
		}
	}
	
	public static void main(String[] args){
		System.out.println(new Combinations().combine(10,7));
	}
}

package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] S){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(S == null || S.length < 1)
			return res;
		Arrays.sort(S);
		for(int len = 0; len<=S.length; len++){
			ArrayList<Integer> sub = new ArrayList<Integer>();
			helper(S, len, 0, res, sub);
		}
		return res;
	}
	private void helper(int[] S, int len, int left,List<List<Integer>> res, List<Integer> sub){
		if(sub.size() == len){
			res.add(new ArrayList<Integer>(sub));
			return;
		}
		for(int i=left; i<S.length; i++){
			sub.add(S[i]);
			helper(S, len, i+1, res, sub);
			sub.remove(sub.size() - 1);
		}
	}
	public static void main(String[] args){
		int[] S = {1,2,3};
		System.out.println(new Subsets().subsets(S));
	}
}

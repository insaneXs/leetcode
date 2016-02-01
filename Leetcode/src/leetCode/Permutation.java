package leetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	public List<List<Integer>> permute(int[] num){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(num == null || num.length < 1)
			return res;
		boolean[] marks = new boolean[num.length];
		List<Integer> sub = new ArrayList<Integer>();
		helper(num,marks,res,sub);
		return res;
	}
	
	private void helper(int[] num, boolean[] marks,List<List<Integer>> res, List<Integer> sub){
		if(sub.size() == num.length){
			res.add(new ArrayList<Integer>(sub));
			return;
		}
		for(int i=0; i<num.length; i++){
			if(marks[i] == true)
				continue;
			sub.add(num[i]);
			marks[i] = true;
			helper(num, marks, res, sub);
			sub.remove(sub.size() - 1);
			marks[i] = false;
		}
	}
}

package leetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++){
			int size = set.size();
			set.add(nums[i]);
			if(size == set.size())
				return true;
		}
		return false;
	}
}

package leetCode;

public class FindDuplicate {
	public int findDuplicate(int[] nums){
		if(nums == null)
			return 0;
		for(int i=0; i<nums.length; i++){
			int num = nums[i];
			for(int j=i+1; j<nums.length; j++){
				if(num == nums[j])
					return num;
			}
		}
		return 0;
	}
	
	public int findDuplicateBy2Search(int[] nums){
		if(nums == null)
			return 0;
		int min = 0, max = nums.length - 1;
		while(min < max){
			int mid = (min + max) >>> 1;
			int count = 0;
			for(int i=0; i<nums.length; i++){
				if(nums[i] <= mid)
					count++;
			}
			if(count < mid)
				max = mid - 1;
			else if(count > mid)
				min = mid + 1;
		}
		return min;
	}
}

package leetCode;

public class NumArray {
	private int[] nums;
	private int[] sum;
	public NumArray(int[] nums){
		this.nums = nums;
		if(nums != null && nums.length > 0){
			sum = new int[nums.length];
			sum[0] = nums[0];
			for(int i=1; i<nums.length; i++){
				sum[i] = nums[i] + sum[i - 1];
			}
		}
	}
	
	public int sumRange(int i, int j){
		if(i >= 0 && j < nums.length){
			if(i == 0)
				return sum[j];
			else
				return sum[j] - sum[i - 1];
		}else{
			return 0;
		}
	}
}

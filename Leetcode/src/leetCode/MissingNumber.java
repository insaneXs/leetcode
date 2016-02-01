package leetCode;

public class MissingNumber {
	public int missingNumber(int[] nums){
		if(nums == null || nums.length == 0)
			return 0;
		int[] arr = new int[nums.length + 1];
		for(int i=0; i<nums.length; i++){
			arr[nums[i]] = 1;
		}
		int i=0;
		for(; i<arr.length; i++){
			if(arr[i] == 0)
				return i;
		}
		return 0;
	}
	
	public int missingNumber2(int[] nums){
		if(nums == null || nums.length == 0)
			return 0;
		int sum = (nums.length + 1) * nums.length / 2;
		for(int i=0; i<nums.length; i++){
			sum -= nums[i];
		}
		return sum;
	}
}

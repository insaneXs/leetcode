package leetCode;

public class HouseRobber {
	private int max = 0;
	public int rob(int[] nums){
		if(nums == null || nums.length == 0)
			return max;
		recursion(nums, 0, 0);
		return max;
	}
	
	public void recursion(int[] nums, int start, int sum){
		if(start >= nums.length){
			max = Math.max(max, sum);
			return;
		}
		sum += nums[start];
		recursion(nums, start + 2, sum);
		if(start + 1 < nums.length){
			sum -= nums[start];
			sum += nums[start + 1];
			recursion(nums, start + 3, sum);
		}
	}
	
	
	public int rob2(int[] nums){
		if(nums == null || nums.length == 0)
			return 0;
		if(nums.length < 2)
			return nums[0];
		int[] maxs = new int[nums.length];
		maxs[0] = nums[0];
		maxs[1] = Math.max(nums[0], nums[1]);
		for(int i=2; i<nums.length; i++){
			maxs[i] = Math.max(maxs[i-1], maxs[i-2] + nums[i]);
		}
		return maxs[maxs.length - 1];
	}
	public static void main(String[] args){
		System.out.println(new HouseRobber().rob(new int[]{1,3,9,4,5,6,3,7}));
	}
}

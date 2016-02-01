package leetCode;

public class MinimumSizeSubarraySum {
	public static int minSubArrayLen(int s, int[] nums) {
     if(nums == null || nums.length < 1)
    	 return 0;
     int size = Integer.MAX_VALUE;
     int sum = 0, count = 0;
     for(int i=0; i<nums.length; i++){
    	 sum += nums[i];
    	 count++;
    	 while(sum >= s && count > 0){
    		 if(sum - nums[i - count + 1] >= s){
    			 sum -= nums[i - count + 1];
    			 count--;
    			 continue;
    		 }
    		 if(size > count){
    			 size = count;
    		 }
    		 break;
    	 }
     }
     return size == Integer.MAX_VALUE? 0 : size;
    }
	
	public static void main(String[] args){
		int s = 4;
		int[] nums = {1,4,4};
		System.out.println(minSubArrayLen(s, nums));
	}
}

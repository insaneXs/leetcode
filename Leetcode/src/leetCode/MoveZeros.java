package leetCode;

import java.util.Arrays;

public class MoveZeros {
	public void moveZeros(int[] nums){
		if(nums == null || nums.length <= 0)
			return;
		int offset = 0;
		for(int i=0; i + offset < nums.length; i++){
			nums[i] = nums[i + offset];
			while(nums[i] == 0){
				offset++;
				if(i+offset >= nums.length)
					break;
				nums[i] = nums[i + offset];
			}
		}
		for(int i = 0; i<offset; i++)
			nums[nums.length - 1 - i] = 0;
	}
	
	public static void main(String[] args){
		int[] nums = new int[]{0,1,0,3,12};
		new MoveZeros().moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}
}

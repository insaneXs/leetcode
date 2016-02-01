package leetCode;

/**
 * 由singleNumber获得思路，当数组中其他元素都重复出现两次，仅有一个元素出现一次时
 * 由 a ^ b = b ^ a, a ^ a = 0, 0 ^ a = a的性质得到
 * 将全部元素异或运算，所得结果即为出现一次的元素
 * 
 * 本题思路是先将全部元素异或一次得出的值即为两个只出现一次的元素a,b异或的值。
 * 求得值的出现1的一位就表示a和b不相同的位，
 * 可根据该位是否为1将元素拆成两个数组,那么所得的两个数组一定是a,b分开且重复的元素在同一边。
 * 即可将问题转为题一，
 * @author xieshang
 */
public class SingleNumber3 {
	public int[] singleNumber(int[] nums){
		if(nums == null || nums.length < 2)
			return new int[0];
		int temp = 0;
		for(int i=0; i<nums.length; i++){
			temp ^= nums[i];
		}
		int index = 0;
		while(temp !=0){
			if(temp % 2 != 0)
				break;
			temp /= 2;
			index++;
		}
		int flag = 1 << index;
		int ans1 = 0, ans2 = 0;
		for(int i=0; i<nums.length; i++){
			if((nums[i] & flag) == 0){
				ans1 ^= nums[i];
			}else{
				ans2 ^= nums[i];
			}
		}
		return new int[]{ans1, ans2};
	}
}

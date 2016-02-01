package leetCode;

public class ContainerWithMostWater {
	public int maxArea(int[] height){
		if(height == null || height.length < 2)
			return 0;
		int maxArea = Integer.MIN_VALUE;
		int left = 0, right = height.length - 1;
		while(left < right){
			int h = Math.min(height[left], height[right]);
			maxArea = Math.max(maxArea, (right - left) * h);
			if( height[left] > height[right])
				right--;
			else
				left++;
		}
		return maxArea;
	}
	
	public static void main(String[] args){
		int[] height = {4,6,2,6,7,11,12};
		System.out.println(new ContainerWithMostWater().maxArea(height));
	}
}

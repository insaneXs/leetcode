package leetCode;

public class FindMinimumInRotatedInArray {
	public int findMin(int[] num){
		int min = num[0];
		for(int i = 1; i<num.length; i++){
			if(num[i] < min)
				return num[i];
		}
		return min;
	}
}

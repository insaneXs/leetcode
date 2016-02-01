package leetCode;

public class SearchInRotateArray2 {
	public boolean search(int[] A,int target){
		if(A == null || A.length < 1)
			return false;
		boolean breakPoint = false;
		int pre = Integer.MIN_VALUE;
		for(int i=0; i<A.length; i++){
			if(A[i] == target)
				return true;
			if(target < A[i] && breakPoint){
				return false;
			}
			if(A[i] < pre)
				breakPoint = true;
			pre = A[i];
		}
		return false;
	}
}

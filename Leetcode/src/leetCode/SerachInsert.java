package leetCode;

public class SerachInsert {
	public static int count = 0;
	public int serchInert(int[] A, int target){
		if(A == null)
			return 0;
		int start = 0;
		int end = A.length - 1;
		int mid = 0;
		while(start <= end){
			mid = (start + end) / 2;
//			System.out.println("[start] = "+ start + "[end] = "+ end + "[mid] =" + mid);
			if(A[mid] < target){
				start = mid + 1;
			}else if(A[mid] > target){
				end = mid - 1;
			}else
				return mid;
		}
		if(A[mid] > target)
			return mid;
		else
			return mid + 1;
	}

	public static void main(String[] args){
		int[] A = {1, 3, 5, 6};
		System.out.println(new SerachInsert().serchInert(A, 4));
	}
}

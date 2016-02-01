package leetCode;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] A, int elem){
		Arrays.sort(A);
		int 
			count = 0,
			i = 0;
		for(; i<A.length; i++){
			if(A[i] > elem)
				break;
			else if(A[i] == elem){
				count++;
				A[i] = A[A.length - count];
			}
		}
		return A.length - count;
	}
}

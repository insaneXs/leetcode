package leetCode;

public class NumberOf1bits {
	public int hammingWeight(int n) {
        if(n < 0)
        	return 0;
        int count = 0;
        while(n > 0){
        	if(n % 2 != 0)
        		count++;
        	n = n >> 1;
        }
        return count;
    }
	
	public static void main(String[] args){
		System.out.println(Integer.MAX_VALUE);
	}
}

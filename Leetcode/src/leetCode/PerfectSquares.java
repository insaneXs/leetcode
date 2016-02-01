package leetCode;

public class PerfectSquares {
	public int numSqures(int n){
		if(n <= 0)
			return 0;
		int[] ans = new int[n + 1];
		ans[1] = 1;
		for(int i=2; i <= n; i++){
			int sqr = (int)Math.sqrt(i);
			int min = Integer.MAX_VALUE;
			for(int j=1; j<=sqr; j++){
				if(min > ans[i - j * j] + 1){
					min = ans[i - j * j] + 1;
					ans[i] = min;
				}
			}
		}
		
		return ans[n];
	}
	
	public static void main(String[] args){
		PerfectSquares ps = new PerfectSquares();
		System.out.println(ps.numSqures(13));
	}
}

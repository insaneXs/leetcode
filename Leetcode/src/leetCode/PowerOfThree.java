package leetCode;


public class PowerOfThree {
	public boolean isPowerOfThree(int n){
		if(n < 0)
			return false;
		double res = Math.rint(Math.log(n) / Math.log(3));
		return res == (int)res;
	}
	
	public static void main(String[] args){
		PowerOfThree p = new PowerOfThree();
		System.out.println(p.isPowerOfThree(45));
	}
}

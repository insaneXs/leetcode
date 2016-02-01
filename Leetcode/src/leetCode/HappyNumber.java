package leetCode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
	public boolean isHappy(int n){
		if(n <= 0)
			return false;
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(n);
		while(n != 1){
			List<Integer> list = getDigits(n);
			int sum = 0;
			for(int i=0; i< list.size(); i++){
				int dig = list.get(i);
				sum += (dig * dig);
			}
			if(arr.contains(sum))
				return false;
			else{
				arr.add(sum);
				n = sum;
			}
		}
		return true;
	}
	
	private List<Integer> getDigits(int n){
		List<Integer> list = new ArrayList<Integer>();
		while(n > 0){
			list.add(n % 10);
			n = n / 10;
		}
		return list;
	}
	
	public static void main(String[] args){
		System.out.println(new HappyNumber().isHappy(7));
	}
}

package leetCode;

import java.util.Stack;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
        int num = n - 1;
        int res = 0;
        Stack<Character> stack = new Stack<Character>();
        while(num >= 0){
        	res = num % 26;
        	stack.push((char)(res + 65));
        	num = num / 26 ;
        	num--;
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
        	sb.append(stack.pop());
        }
        return sb.toString();
    }
	public static void main(String[] args){
		System.out.println(new ExcelSheetColumnTitle().convertToTitle(26));
	}
}

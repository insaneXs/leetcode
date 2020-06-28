package com.insanexs.leetcode.algorithms;




public class EvalRPN {
	
	public static int evalRPN(String[] tokens) {
		java.util.Stack<Integer> numbers = new java.util.Stack<Integer>();
		int result = 0;
		for(String s : tokens ){
			try{
				int num = Integer.valueOf(s);
				numbers.push(num);
			}catch(Exception e){
				int num1 = numbers.pop();
				int num2 = numbers.pop();
				if(s.equals("+")){
					result = num2 +num1;
				}else if(s.equals("-")){
					result = num2 -num1;
				}else if(s.equals("*")){
					result = num2 * num1;
				}else if(s.equals("/")){
					result = num2 / num1;
				}
				numbers.push(result);
			}
		}
		return numbers.pop();
    }

	public static void main(String[] args) {
		String[] tokens = {"4","13","5","/","+"};
		System.out.println(4/13);
		System.out.println(EvalRPN.evalRPN(tokens));
	}

}

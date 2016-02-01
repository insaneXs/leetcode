package leetCode;

import java.util.Stack;


public class ValidParenthese {
	public boolean isValid(String s){
		if(s == null || s.equals(""))
			return true;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '[' || c == '{' || c == '(')
				stack.push(c);
			else if(c == ']' || c == '}' || c == ')'){
				if(stack.isEmpty())
					return false;
				char cpop = stack.pop();
				switch(c){
				case ']':
					if(cpop != '[')
						return false;
					break;
				case '}':
					if(cpop != '{')
						return false;
					break;
				case ')':
					if(cpop != '(')
						return false;
					break;
				}
			}else
				return false;
			
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		System.out.println(new ValidParenthese().isValid("[{([)]}]"));
	}
}

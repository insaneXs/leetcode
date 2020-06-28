package com.leetCode.oj;


public class ReverseWord {
	public static String reverseWord(String s){
		if("".equals(s)|s.trim().length() == 0)
			return "";
		String regex = "(([^\\s]+(?=\\s))|([^\\s]*[^\\s]$))";
		java.util.regex.Pattern p = java.util.regex.Pattern.compile(regex);
		java.util.regex.Matcher m = p.matcher(s);
		java.util.Vector<String> v = new java.util.Vector<String>();
		int index = 0;
		while(m.find()){
			v.add(index, m.group());
			index++;
		}
		if(v.size() == 0)
		    return "";
		StringBuffer sb = new StringBuffer();
		for(int i =v.size()-1;  i> 0; i--){
			sb.append(v.elementAt(i));
			sb.append(" ");
		}
		sb.append(v.elementAt(0));
		return sb.toString();
		
	}

	public static void main(String[] args) {
		System.out.println(ReverseWord.reverseWord("hi "));
	}

}

package com.insanexs.leetcode.algorithms;


/**
 * @ClassName LongestPalindrome
 * @Description Longest Palindrome #409 Easy
 * @Author xieshang
 * @Date 2020/11/6
 */
public class LongestPalindrome {
	public int longestPalindrome(String s){
		int[] record = new int[52];

		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			int idx = 0;
			if(c >= 'a' && c <= 'z'){
				idx = c - 'a';
			}else{
				idx = c - 'A' + 26;
			}
			int oldVal = record[idx];
			record[idx] = oldVal + 1;
		}

		int sum = 0;
		for(int i=0; i<record.length; i++){
			sum = sum + (record[i] % 2 == 0 ? record[i] : record[i] - 1);
		}
		return sum < s.length() ? sum + 1 : sum;
	}

	private boolean isPalindrome(String s, int start, int end){
		while(start <= end){
			if(s.charAt(start) == s.charAt(end)){
				start++;
				end--;
			}else{
				break;
			}
		}
		return start > end;
	}

	public static void main(String[] args){
		String s = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel";
		System.out.println(new LongestPalindrome().longestPalindrome(s));
	}
}

package com.insanexs.leetcode.algorithms;

/**
 * @ClassName ReverseVowelsOfAString
 * @Description Reverse Vowels Of A String #345 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s){
        if(s == null || s.length() <= 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int i=0, j=chars.length - 1;
        while(i < j){
            for(; i<j; i++){
                System.out.println("i= " + i);
                if(isVowels(chars[i])){
                    break;
                }
            }

            for(; i<j; j--){
                System.out.println("j= " + j);
                if(isVowels(chars[j])){
                    break;
                }
            }

            if(isVowels(chars[i]) && isVowels(chars[j])){
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    private boolean isVowels(char c){
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
                || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        System.out.println(new ReverseVowelsOfAString().reverseVowels(".,"));
    }
}

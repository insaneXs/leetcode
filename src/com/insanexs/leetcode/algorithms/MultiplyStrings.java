package com.insanexs.leetcode.algorithms;

import java.util.Arrays;

/**
 * @ClassName MultiplyStrings
 * @Description Multiply Strings #43 (Medium)
 * @Author xieshang
 * @Date 2020/7/14 3:06 下午
 */
public class MultiplyStrings {
    public static void main(String[] args){
        System.out.println(new MultiplyStrings().multiply("985", "123"));

    }

    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        char[] num1Digits = num1.toCharArray();
        char[] num2Digits = num2.toCharArray();
        String ret = "0";
        for(int i=num1Digits.length - 1; i>=0; i--){
            int digit1 = num1Digits[i] - '0';

            for(int j=num2Digits.length -1; j>=0; j--){
                int digit2 = num2Digits[j] - '0';

                StringBuilder tmp = new StringBuilder().append(digit1 * digit2);
                int count = 2;
                while(count < (num1Digits.length + num2Digits.length - i - j)){
                    tmp.append('0');
                    count++;
                }
                System.out.println(digit1 + "*" + digit2 + "=" + tmp);
                ret = strSum(ret, tmp.toString());
            }
        }
        return ret;
    }


    private String strSum(String str1, String str2){
        int maxLength = Math.max(str1.length(), str2.length()) + 1;
        char[] chars = new char[maxLength];
        char[] str1Chars = new char[maxLength];
        char[] str2Chars = new char[maxLength];
        Arrays.fill(str1Chars, '0');
        Arrays.fill(str2Chars, '0');
        System.arraycopy(str1.toCharArray(),0, str1Chars, str1Chars.length - str1.length(), str1.length());
        System.arraycopy(str2.toCharArray(), 0, str2Chars, str2Chars.length - str2.length(), str2.length());
        boolean plus1 = false;
        for(int i=maxLength - 1; i>=0; i--){
            int digits1 = str1Chars[i] - '0';

            int digits2 = str2Chars[i] - '0';

            int tmp = digits1 + digits2;
            if(plus1){
                tmp++;
            }
            plus1 = tmp / 10 >=1;
            chars[i] = (char) (tmp % 10 + '0');
        }
        return chars[0] == '0' ? new String(chars, 1, chars.length - 1) : new String(chars);
    }
}

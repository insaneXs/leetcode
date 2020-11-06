package com.insanexs.leetcode.algorithms;

/**
 * @ClassName AddStrings
 * @Description Add Strings #415 (Easy)
 * @Author xieshang
 * @Date 2020/11/6
 */
public class AddStrings {

    public String addStrings(String num1, String num2){
        int i=num1.length() - 1, j=num2.length() - 1;
        String ret = "";
        int flag = 0;
        while(i >=0 || j >=0){

            int c1 = 0;
            if(i >= 0){
                c1 = num1.charAt(i) - '0';
            }

            int c2 = 0;
            if(j >=0){
                c2 = num2.charAt(j) - '0';
            }

            int sum = c1 + c2 + flag;
            if((sum) >= 10){
                sum = sum - 10;
                flag = 1;
            }else{
                flag = 0;
            }

            ret = sum + ret;
            i--;
            j--;
        }

        if(flag == 1){
            ret = "1" + ret;
        }
        return  ret;
    }
}

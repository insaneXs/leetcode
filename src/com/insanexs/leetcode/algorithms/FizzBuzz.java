package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName FizzBuzz
 * @Description FizzBuzz #412 (Easy)
 * @Author xieshang
 * @Date 2020/11/6
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n){
        List<String> ret = new ArrayList<>();
        if(n <= 0){
            return ret;
        }

        for(int i=1; i<=n; i++){
            StringBuilder s = new StringBuilder();
            if( i % 3 == 0 ){
                s.append("Fizz");
            }
            if(i % 5 == 0){
                s.append("Buzz");
            }

            if(s.length() == 0){
                s.append(i);
            }
            ret.add(s.toString());
        }
        return ret;
    }


    public static void main(String[] args) {
        //test case - 1
        new FizzBuzz().fizzBuzz(1);
        //0

        // only fizz

        // only buzz

        // fizz buzz
    }
}

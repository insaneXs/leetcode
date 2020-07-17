package com.insanexs.leetcode.algorithms;

import java.util.Arrays;
import java.util.Stack;

/**
 * @ClassName SimplifyPath
 * @Description Simplify Path #71 (Medium)
 * @Author xieshang
 * @Date 2020/7/17 6:31 下午
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] strs = path.split("/");
        System.out.println(Arrays.toString(strs));
        for(int i=0; i<strs.length; i++){
            System.out.println(stack);
            if("".equals(strs[i]) || ".".equals(strs[i])){
                continue;
            }else if("..".equals(strs[i])){
                if(stack.size() >= 1){
                    stack.pop();
                }
            }else {
                if(stack.isEmpty() || !"/".equals(stack.peek())){
                    stack.push("/"+strs[i]);
                }else{
                    stack.push(strs[i]);
                }
            }
        }
        if(stack.isEmpty()){
            stack.push("/");
        }
        StringBuilder sb = new StringBuilder();
        stack.subList(0, stack.size()).forEach(str -> sb.append(str));
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(new SimplifyPath().simplifyPath("/a//b////c/d//././/.."));
    }


}

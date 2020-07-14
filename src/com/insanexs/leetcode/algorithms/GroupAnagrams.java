package com.insanexs.leetcode.algorithms;

import java.util.*;

/**
 * @ClassName GroupAnagrams
 * @Description Group Anagrams #49 (Medium)
 * @Author xieshang
 * @Date 2020/7/14 6:11 下午
 */
public class GroupAnagrams {

    //Time Limited Exceeded
//    public List<List<String>> groupAnagrams(String[] strs){
//        List<List<String>> ret = new ArrayList<>();
//        String target = null;
//
//        for(int i=0; i<strs.length; i++){
//            if(strs[i] == null){
//                continue;
//            }
//            target = strs[i];
//            List<String> tmp = new ArrayList<>();
//            tmp.add(target);
//            for(int j=i+1; j<strs.length; j++){
//                if(strs[j] == null || strs[j].length() != target.length()){
//                    continue;
//                }
//                Map<Character, Integer> map = new HashMap<Character, Integer>();
//                for(char c : strs[j].toCharArray()){
//                    Integer integer = map.getOrDefault(c, new Integer(0));
//                    integer = integer + 1;
//                    map.put(c, integer);
//                }
//                boolean isMatch = true;
//                for(char c : target.toCharArray()){
//                    Integer integer = map.get(c);
//                    if(integer == null){
//                        isMatch = false;
//                        break;
//                    }else{
//                        integer = integer - 1;
//                        if(integer == 0){
//                            map.remove(c);
//                        }else{
//                            map.put(c, integer);
//                        }
//                    }
//                }
//                if(isMatch && map.isEmpty()){
//                    tmp.add(strs[j]);
//                    strs[j] = null;
//                }
//            }
//            ret.add(tmp);
//        }
//        return ret;
//    }

    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> res = new ArrayList<>();

        Map<ArraysHolder, List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            List<String> list = map.getOrDefault(new ArraysHolder(chars), new ArrayList<String>());
            list.add(strs[i]);
            map.put(new ArraysHolder(chars), list);
        }
        res.addAll(map.values());
        return res;
    }

    class ArraysHolder{
        char[] chars;
        public ArraysHolder(char[] chars){
            this.chars = chars;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ArraysHolder that = (ArraysHolder) o;
            if(this.chars.length != ((ArraysHolder) o).chars.length) return false;

            for(int i=0; i<chars.length; i++){
                if(chars[i] != ((ArraysHolder) o).chars[i]){
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(chars);
        }
    }


    public static void main(String[] args){
        System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"123","231","tan","ate","nat","bat"}));
    }
}

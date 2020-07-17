package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName MergeInterval
 * @Description Merge Interval #56
 * @Author xieshang
 * @Date 2020/7/16 7:40 下午
 */
public class MergeInterval {

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0){
            return new int[][]{};
        }
        List<ArrayHolder> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++){
            list.add(new ArrayHolder(findMinAndMax(intervals[i])));
        }

        Collections.sort(list);
        System.out.println(list);
        List<ArrayHolder> mergedList = new ArrayList<>();
        mergedList.add(list.get(0));

        for(int i=1; i<list.size(); i++){
            ArrayHolder holder = mergedList.get(mergedList.size() - 1);
            if(holder.arr[1] >= list.get(i).arr[0]){
                if(holder.arr[1] < list.get(i).arr[1]){
                    holder.arr[1] = list.get(i).arr[1];
                }
            }else{
                mergedList.add(list.get(i));
            }
        }

        System.out.println(mergedList);
        int[][] res = new int[mergedList.size()][];

        for(int i=0; i<mergedList.size(); i++){
            res[i] = mergedList.get(i).arr;
        }
        return res;
    }

    public int[] findMinAndMax(int[] nums){
        int[] res = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for(int i=0; i<nums.length; i++){
            if(nums[i] < res[0]){
                res[0] = nums[i];
            }
            if(nums[i] > res[1]){
                res[1] = nums[i];
            }
        }
        return res;
    }

    class ArrayHolder implements Comparable<ArrayHolder>{
        int[] arr;

        public ArrayHolder(int[] res){
            this.arr = res;
        }


        @Override
        public int compareTo(ArrayHolder o) {
            return arr[0] - o.arr[0];
        }

        @Override
        public String toString() {
            return "ArrayHolder{" +
                    "arr=" + Arrays.toString(arr) +
                    '}';
        }
    }

    public static void main(String[] args){
        int[][] matrix = {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.toString(new MergeInterval().merge(matrix)));
    }

}

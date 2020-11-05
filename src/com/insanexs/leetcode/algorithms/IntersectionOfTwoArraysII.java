package com.insanexs.leetcode.algorithms;

import java.util.*;

/**
 * @ClassName IntersectionOfTwoArraysII
 * @Description Intersection Of Two Arrays II #350 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class IntersectionOfTwoArraysII {

    public int[] intersection(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0, j=0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ret = new int[list.size()];
        for(i=0; i<list.size(); i++){
            ret[i] = list.get(i);
        }

        return ret;
    }

}

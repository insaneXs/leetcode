package com.insanexs.leetcode.algorithms;

import java.util.*;

/**
 * @ClassName IntersectionOfTwoArrays
 * @Description Intersection Of Two Arrays #349 (Easy)
 * @Author xieshang
 * @Date 2020/11/5
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> list = new HashSet<>();

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
        i = 0;
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            ret[i++] = it.next();
        }

       return ret;
    }
}

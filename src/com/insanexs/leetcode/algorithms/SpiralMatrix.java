package com.insanexs.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SpiralMatrix
 * @Description Spiral Matrix #54 (Medium)
 * @Author xieshang
 * @Date 2020/7/16 6:12 下午
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        int x1 = 0;
        int x2 = matrix.length-1;
        int y1 = 0;
        int y2 = matrix[0].length-1;
        int x = 0;
        int y = 0;
        while (x1 <= x2 && y1 <= y2) { //要通过双指针确定边界
            while (y <= y2){
                res.add(matrix[x][y++]);
            }
            x1++;
            x++;
            y--;
            if (x1 > x2){
                break;
            }
            while (x <= x2){
                res.add(matrix[x++][y]);
            }
            y2--;
            x--;
            y--;
            if (y1 > y2) break;
            while (y >= y1){
                res.add(matrix[x][y--]);
            }
            x2--;
            y++;
            x--;
            if (x1 > x2){
                break;
            }
            while (x >= x1){
                res.add(matrix[x--][y]);
            }
            y1++;
            x++;
            y++;
        }
        return res;
    }
}

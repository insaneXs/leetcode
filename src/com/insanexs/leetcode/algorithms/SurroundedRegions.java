package com.insanexs.leetcode.algorithms;

import java.util.Stack;

/**
 * @ClassName SurroundedRegions
 * @Description #130 Surrounded Regions (Medium) 以四条边做深度优先遍历，确定能escape的元素
 * @Author xieshang
 * @Date 2020/11/4
 */
public class SurroundedRegions {

    static class Step{
        int x;
        int y;

        Step(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public void solve(char[][] board){

        for(int i=1; i<board.length - 1; i++){
            for(int j=1; j<board[0].length - 1; j++){
                if(board[i][j] == 'O' && !canEscape(board, i, j, new boolean[board.length][board[0].length])){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void solve2(char[][] board){
        if(board == null || board.length == 0 || board[0] == null){
            return;
        }
        for(int i=0; i<board.length; i++){
            dfs(board, i, 0);
            dfs(board, i, board[0].length -1);
        }

        for(int i=0; i<board[0].length; i++){
            dfs(board, 0, i);
            dfs(board, board.length-1, i);
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == '*'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    private void dfs(char[][] board, int i, int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length){
            return;
        }
        print(board);
        if(board[i][j] == 'O'){
            board[i][j] = '*';
            dfs(board, i, j + 1);
            dfs(board, i, j - 1);
            dfs(board, i- 1, j);
            dfs(board, i + 1, j);
        }

    }

    private boolean canEscape(char[][] board, int i, int j, boolean[][] visited){

        int[][] move = {{1,0},{0,1},{-1,0},{0,-1}};

        Stack<Step> steps = new Stack<>();
        steps.push(new Step(i, j));

        while(!steps.isEmpty()){
            Step step = steps.peek();
            int d = 0;
            while(d < 4){
                int x = step.x + move[d][0];
                int y = step.y + move[d][1];
                if(x < 0 || x > board.length - 1 || y < 0 || y > board[0].length - 1) { //reach board
                    return true;
                } else if(board[x][y] == 'X' || visited[x][y]){
                    d++;
                    continue;
                }else {
                    visited[x][y] = true; //mark as visited
                    steps.push(new Step(x, y));
                    System.out.println(x + "," + y);
                    break;
                }
            }

            if(d == 4){
                steps.pop();
            }
        }
        return false;
    }

    public static void main(String[] args){
        SurroundedRegions slove = new SurroundedRegions();
//        char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        char[][] board = {{'X','O','X','X'},{'O','X','O','X'},{'X','O','X','O'},{'O','X','O','X'}};
//        char[][] board = {};
        slove.solve2(board);

        print(board);
    }

    public static void print(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

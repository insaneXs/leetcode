package com.insanexs.leetcode.algorithms;

/**
 * @ClassName WordSearch
 * @Description Word Search #79 (Medium)
 * @Author xieshang
 * @Date 2020/7/17 7:27 下午
 */
public class WordSearch {

    public boolean exist(char[][] board, String word){
        if(board == null || board.length == 0 || board[0].length ==0){
            return false;
        }
        boolean[][] visited = new boolean[board.length][];
        for(int i=0; i<visited.length; i++){
            visited[i] = new boolean[board[0].length];
        }

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(doSearch(board, visited, word, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }


    private boolean doSearch(char[][] board, boolean[][] visited, String word, int i, int j, int count){
        if(visited[i][j] || word.charAt(count) != board[i][j]){
            return false;
        }
        if(count == word.length()-1){
            return true;
        }
        count++;
        visited[i][j] = true;

        if(j<board[i].length-1 && doSearch(board, visited, word, i, j+1, count)){
             return true;
        }

        if(i<board.length-1 && doSearch(board, visited, word, i+1, j, count)){
            return true;
        }

        if(j>0 && doSearch(board, visited, word, i, j-1, count)){
            return true;
        }

        if(i>0 && doSearch(board, visited, word, i-1, j,count)){
            return true;
        }
        visited[i][j] =false;
        return false;
    }


    public static void main(String[] args){
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'}
        };
        System.out.println(new WordSearch().exist(board, "AAB"));
    }
}

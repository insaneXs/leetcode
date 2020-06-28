package com.leetCode.oj;

import java.util.Stack;

public class SurrondedRegions {
	static class Point{
		int x;
		int y;
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	public  void solve(char[][] board){
		int row = board.length;
		for(int i=1; i< row;i++){
			for(int j=1; j<board[i].length; j++){
//				System.out.println("board["+i+"]["+j+"] = "+board[i][j]);
				if(board[i][j] == 'o'){
					maze(board,new Point(i,j));
				}
			}
		}
	}
	
	public static void maze(char[][] board,Point start){
		Stack<Point> step = new Stack<Point>(); 
		int[][] move = {{0,1},{1,0},{0,-1},{-1,0}};// 4 diction to move;
		step.push(start);
		board[start.x][start.y] = 'c';
		while(!step.isEmpty()){
			Point p = step.pop();
//			board[p.x][p.y] = 'c';
			int x = p.x;
			int y = p.y;
			int d = 0;
			while(d < 4){
				int i = x + move[d][0];
				int j = y + move[d][1];
//				System.out.println("int i= "+i+" j = "+j);
				//Escape from the maze;
				if(i < 0 || i > board.length -1 || j < 0 || j > board[i].length - 1){
					//TODO replace 'c' by 'o';
					for(int row=0; row<board.length; row++)
						for(int col=0; col<board[row].length; col++)
							if(board[row][col] == 'c')
								board[row][col] = 'o';
					return;
				}else{
					if(board[i][j] != 'x' && board[i][j] != 'c'){
						step.push(new Point(x,y));
						step.push(new Point(i,j));
						board[i][j] = 'c';
						break;
					}
				}
				d++;
			}
		}
		// Can not escape from the maze;
		//TODO replace 'c' by 'x';
//		System.out.println("can not escape.");
		for(int row=0; row<board.length; row++)
			for(int col=0; col<board[row].length; col++)
				if(board[row][col] == 'c')
					board[row][col] = 'x';
	}
	
	/*
	 * Test...
	 */
	public static void main(String[] args){
//		char[][] board = {{'x','o','x','x'},{'x','o','x','x'},{'x','o','x','x'},{'x','x','x','x'}};
		char[][] board = {{'x','x','x'},{'x','o','x'},{'x','x','x'}};
//		char[][] board = {"xxoxxxx".toCharArray(),"xoxxoxxooxx".toCharArray(),"xxxxooooxxoxoxx".toCharArray(),"xxoxxoxxoooxoo".toCharArray(),"xxxxxxooxx".toCharArray()};
		System.out.println("Input: ");
		for(int row=0; row<board.length; row++){
			for(int col=0; col<board[row].length; col++){
				System.out.print(board[row][col]+" ");
			}
			System.out.println("");
		}
		new SurrondedRegions().solve(board);
		System.out.println("Output:");
		for(int row=0; row<board.length; row++){
			for(int col=0; col<board[row].length; col++){
				System.out.print(board[row][col]+" ");
			}
			System.out.println("");
		}
	}
}

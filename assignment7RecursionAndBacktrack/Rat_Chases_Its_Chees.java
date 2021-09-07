/*
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. 
The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). 
It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . 
Find that path and help the rat reach its cheese.

Input Format
First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints
1 <= N , M <= 10

Output Format
Print N lines, containing M integers each. 
A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"

Sample Input
5 4
OXOO
OOOX
XOXO
XOOX
XXOO
Sample Output
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 
 */

package assignment7RecursionAndBacktrack;

import java.util.Scanner;

public class Rat_Chases_Its_Chees {

	public static void main(String args[]) 
	{
        ans=false;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       char[][] arr = new char[n][m];
       for (int i=0;i<n;i++){
           String str=sc.next();
           for(int j=0;j<m;j++){
               arr[i][j]=str.charAt(j);
           }
       }
       int[][] visited=new int[n][m];
       rat(arr,visited,0,0);
       if(!ans){
           System.out.print("NO PATH FOUND");
       }
   }
   static boolean ans=false;
   public static void rat(char[][] arr,int[][] visited,int row,int col){
       if(row== arr.length-1 && col==arr[0].length-1)
       {
    	   visited[row][col] = 1;
           ans=true;
           for (int i=0;i<visited.length;i++){
               for (int j=0;j<visited[0].length;j++){
                   System.out.print(visited[i][j]+" ");
               }
               System.out.println();
           }
           return;
       }
       if(row==-1 || row== arr.length || col==-1 || col==arr[0].length || visited[row][col]==1 || arr[row][col]=='X'){
           return;
       }
       visited[row][col]=1;
       rat(arr,visited,row,col-1);
       rat(arr,visited,row,col+1);
       rat(arr,visited,row-1,col);
       rat(arr,visited,row+1,col);
       visited[row][col]=0;
   }

}

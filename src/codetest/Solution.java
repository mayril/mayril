package codetest;

import java.util.Scanner;

public class Solution
{
public static void main(String args[]) throws Exception
{
/*
 *  */
	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		String[][] chess=new String[8][8];
		String[][] chess2=new String[8][8];
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if ((i+j%2)==0) {
					chess[i][j]="B";
				}else {
					chess[i][j]="W";
				}
			}
		}
		
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args.length; j++) {
				if ((i+j%2)==0) {
					chess2[i][j]="W";
				}else {
					chess2[i][j]="B";
				}
			}
		}
		
		int y=sc.nextInt();
		int x=sc.nextInt();
		String[][] board=new String[y][x];
		String boardChar="";
		for (int i = 0; i < y; i++) {
			boardChar+=sc.next();
		}
		String[] boards=boardChar.split("");
		int count=0;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				board[y][x]=boards[count++];
			}
		}
	
		System.out.println("#"+test_case+" ");
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
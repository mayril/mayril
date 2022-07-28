package bakjoon;

import java.util.Scanner;


public class Baek1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] chess=new String[9][9];
		
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if ((i+j)%2==0) {
					chess[i][j]="B";
				}else {
					chess[i][j]="W";
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
		
		int count=0;
		String[] bStrings=boardChar.split("");
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				board[i][j]=bStrings[count];
				count++;
			}
		}
		
	
	


		
		
		int result2=100;
		for (int i2 = 0; i2 <= y-8; i2++) {
			for (int j2 = 0; j2 <= x-8; j2++) {
				int bcount=0;
				int wcount=0;
				int result=0;
				for (int i = 1; i <= 8; i++) {
					for (int j = 1; j <= 8; j++) {
						if (board[i-1+i2][j-1+j2].equals(chess[i][j])) {
							bcount++;
						}else {
							wcount++;
						}
					}
				}
				
				if (wcount>bcount) {
					result=64-wcount;
				}else {
					result=64-bcount;
				}
				
				if (result<result2) {
					result2=result;
				}
			}
		}
		
	
		System.out.println(result2);

		//-----------------------
	}
	
}

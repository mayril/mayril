package codetest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String input="";
		int kcnt=0;
		for (int i = 0; i < 8; i++) {
			input+=sc.nextLine();		
		}
		
		String[] k=input.split("");

		
		String[][] chess=new String[9][9];
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				chess[i][j]=k[kcnt++];

			}

		}
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if((i+j)%2==0) {
					if (chess[i][j].equals("F")) {
						count++;
					}
					
				}
			}
		}
		
		System.out.println(count);
		//-----------------------
	}
	
}

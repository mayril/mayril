package codetest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			double bridge=sc.nextDouble();
			double bridge2=sc.nextDouble();
			
			double k2=1;
			double r=bridge2-bridge;
			double r2=1;



			for (double j = bridge+1; j <= bridge2; j++) {
				k2=k2*j;
			}

			for (double j = 1; j <= r; j++) {
				r2=r2*j;
			}
			double result=k2/r2;
			System.out.printf("%.0f\n",result);

		
		}
		
		//-----------------------
	}
	
}

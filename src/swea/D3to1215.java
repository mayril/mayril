package swea;

import java.util.Arrays;
import java.util.Scanner;





public class D3to1215
{
public static void main(String args[]) throws Exception
{
/*
 * 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
 *  */
	Scanner sc = new Scanner(System.in);

	//int T=sc.nextInt();

	for(int test_case = 1; test_case <= 10; test_case++)
	{	
		int size=sc.nextInt();
		String[][] arr1=new String[8][8];
		int cntan=0;
		
		String das="";
		for (int i = 0; i < 8; i++) {
			das+=sc.next();
		}
		String[] das2=das.split("");
		int cnt=0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				arr1[i][j]=das2[cnt++];
			}
		}
		
		
		String input="";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j <= 8-size; j++) {
				
				for (int j2 = 0; j2 < size; j2++) {
					input+=arr1[i][j+j2];

				}
				if (palidrom(input)) {
					cntan++;
				}
				input="";
			}
		}
		
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j <= 8-size; j++) {
				for (int j2 = 0; j2 < size; j2++) {
					input+=arr1[j+j2][i];
				}
				if (palidrom(input)) {
					cntan++;
				}
				input="";
			}
		}
		
		System.out.println("#"+test_case+" "+cntan);
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}


	static boolean palidrom(String input) {
		String[] arr1=input.split("");
		int l=arr1.length;
		int t=1;
		for (int i = 0; i < arr1.length/2; i++) {
			if (!arr1[i].equals(arr1[l-i-1])) {
				t=0;
			}
		}
		
		if (t==1) {
			return true;	
		} else {
			return false;
		}
	
	}
}


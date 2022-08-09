package swea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class D3to1216
{
public static void main(String args[]) throws Exception
{
/*
 * 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
 *  */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//int T=Integer.parseInt(br.readLine());

	for(int test_case = 1; test_case <= 10; test_case++)
	{	
		int t=Integer.parseInt(br.readLine());
		int max=0;
		char[][] arr1=new char[100][100];

		StringBuilder dassb=new StringBuilder();
		StringBuilder dassb2=new StringBuilder();

		int cnt=0;
		 for(int i = 0; i < 100; i++) {
             String s = br.readLine();
             for(int j = 0; j < 100; j++) {
                 arr1[i][j] = s.charAt(j);
             }
         }
		 
		loop1:
		for (int size = 100; size >0; size--) {

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j <= 100-size; j++) {
					for (int j2 = 0; j2 < size; j2++) {
						dassb.append(arr1[i][j+j2]);

					}
					if (palidrom(dassb.toString())) {
							max=size;
						break loop1;
					}
					dassb.setLength(0);
				}
			}
			

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j <= 100-size; j++) {
					for (int j2 = 0; j2 < size; j2++) {
						dassb2.append(arr1[j+j2][i]);
					}
					if (palidrom(dassb2.toString())) {
						max=size;
						break loop1;
					}
					dassb2.setLength(0);
				}
			}
		}
		

		System.out.println("#"+t+" "+max);
		
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


package codetest;

import java.util.Scanner;

public class Solution
{
public static void main(String args[]) throws Exception
{
/*
 * 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
 *  */
	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int [] arr1=new int[10];
		for (int i = 0; i < 10; i++) {
			arr1[i]=sc.nextInt();
		}
		
		
		int max=0;
		
		for (int i = 0; i < 10; i++) {
			if (arr1[i]>max) {
				max=arr1[i];
			}
		}
		System.out.println("#"+test_case+" "+max);
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
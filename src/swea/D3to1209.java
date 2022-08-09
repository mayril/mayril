package swea;

import java.util.Arrays;
import java.util.Scanner;



public class D3to1209
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
		test_case=sc.nextInt();
		int [][] ar1=new int[100][100];
		
		int [] answr=new int[202];
		int sum=0;
		int cnt=0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				ar1[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				sum+=ar1[i][j];
			}
			answr[cnt++]=sum;
			sum=0;
		}
		for (int j = 0; j < 100; j++) {
			
			for (int i = 0; i < 100; i++) {
				sum+=ar1[i][j];
			}
			answr[cnt++]=sum;
			sum=0;
		}
		
		for (int i = 0; i < 100; i++) {
			sum+=ar1[i][i];
		}
		answr[cnt++]=sum;
		sum=0;
		for (int i = 0; i < 100; i++) {
			sum+=ar1[i][99-i];
		}
		answr[cnt++]=sum;
		sum=0;
		
		int max=0;
		for (int i = 0; i < answr.length; i++) {
			if (answr[i]>max) {
				max=answr[i];
			}
		}
		
		System.out.println("#"+test_case+" "+max);
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
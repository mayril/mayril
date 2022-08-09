package swea;

import java.util.Scanner;


public class D3to1217
{

public static void main(String args[]) 
{
/*
 * 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
 *  */
	Scanner sc = new Scanner(System.in);

	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T=10;
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int t=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		
		System.out.println("#"+t+" "+addd(n,m));
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}

	public static int addd(int n,int m) {
		   if(m==1) {
	            return n;
		   }
	        return n*addd(n,m-1);
	    }

}




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution
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
		String c=br.readLine();
		StringBuilder stringBuilder=new StringBuilder();
		String clue=br.readLine();
		stringBuilder.append(br.readLine());
		int k=0;
		int t=0;
		while (t!=-1) {
			t=stringBuilder.indexOf(clue, t+clue.length());
			//System.out.println(t);
			if (t!=-1) {
				k++;
			}
			
		} 

		
		System.out.println("#"+test_case+" "+(k));
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}

}


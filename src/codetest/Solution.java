package codetest;

import java.util.Scanner;

public class Solution
{
public static void main(String args[]) throws Exception
{
/*
1차원 초원이 있었다.

................

 
여기에 공을 몇 개 놓았다. 공은 열린 괄호와 닫힌 괄호가 붙어 있는 ‘()’로 표현되며, 서로 다른 두 공이 겹치지 않는다.

...()..()()...().


여기에 잡초가 자라서 몇 개의 칸이 가려지게 되었다. 잡초는 ‘|’로 표현된다.

|..(|.||)||||.().

 

위와 같은 과정을 통해 얻어진 문자열이 주어진다. 이때, 초원에 놓았을 수 있는 공의 개수의 최솟값을 구하는 프로그램을 작성하라.

[입력]

첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 테스트 케이스는 한 개의 줄로 이루어지며, 각 줄에는 길이가 1이상 50 이하인 문자열 S가 주어진다. 이 문자열은 위의 과정을 통해 만들어졌음이 보장된다.

[출력]

각 테스트 케이스마다, 초원에 놓였을 수 있는 공의 개수의 최솟값을 구하는 프로그램을 작성하라.
 *  */
	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();
	
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		String field=sc.next();
		int balls=0;
		
		String[] grass=field.split("");
		for (int i = 0; i < grass.length; i++) {
			if (grass[i].equals("(")||grass[i].equals(")")) {
				balls++;
			}
		}
		
		for (int i = 0; i < field.length()-1; i++) {
			if (field.substring(i, i+2).equals("()")) {
				balls--;
			};
		}
		
		System.out.println("#"+test_case+" "+balls);
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
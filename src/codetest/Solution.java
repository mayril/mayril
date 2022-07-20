package codetest;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
public static void main(String args[]) throws Exception
{
/*
 * 어느 고등학교에서 실시한 1000명의 수학 성적을 토대로 통계 자료를 만들려고 한다.

이때, 이 학교에서는 최빈수를 이용하여 학생들의 평균 수준을 짐작하는데, 여기서 최빈수는 특정 자료에서 가장 여러 번 나타나는 값을 의미한다.

다음과 같은 수 분포가 있으면,

10, 8, 7, 2, 2, 4, 8, 8, 8, 9, 5, 5, 3

최빈수는 8이 된다.

최빈수를 출력하는 프로그램을 작성하여라 (단, 최빈수가 여러 개 일 때에는 가장 큰 점수를 출력하라).

[제약 사항]

학생의 수는 1000명이며, 각 학생의 점수는 0점 이상 100점 이하의 값이다.
 * 
 */
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int num =sc.nextInt();	

		Integer [] test= new Integer[101];
		int max=0;
		int maxnum=0;
		for (int i = 0; i <= 100; i++) {
			test[i]=0;
		}
		for (int i = 0; i < 1000; i++) {
			int student= sc.nextInt();
			test[student]+=1;
		}
		 for (int i = 0; i <= 100; i++) {
				if(test[i]>max) {
					max=test[i];
				}
		}
		 for (int i = 0; i <= 100; i++) {
				if(max==test[i]) {
					maxnum=i;
				}
		}
		 System.out.println("#"+test_case+" "+maxnum);
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
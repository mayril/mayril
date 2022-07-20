package swea;

import java.util.Scanner;

public class D2to2007
{
public static void main(String args[]) throws Exception
{
/*
 * 패턴에서 반복되는 부분을 마디라고 부른다. 문자열을 입력 받아 마디의 길이를 출력하는 프로그램을 작성하라.


[제약 사항]

각 문자열의 길이는 30이다. 마디의 최대 길이는 10이다.


[입력]

가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 길이가 30인 문자열이 주어진다.
 */
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		String banbook=sc.next();
		String banmadi="";
		int size1=banbook.length();
		for (int i = 1; i <= banbook.length(); i++) {
			String madi=banbook.substring(0,i);
			for (int j = 1; j <banbook.length()/i; j++) {
				if(madi.equals(banbook.substring(i*j,i*(j+1)))){
					if(madi.equals(banbook.substring(i,i*2))) {
						if(i<size1&&i!=1) {
							banmadi=madi;
							size1=i;
						}
					}
				}
			}
			
		}
		 System.out.println("#"+test_case+" "+banmadi.length());
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
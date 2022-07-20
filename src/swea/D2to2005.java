package swea;

import java.util.Scanner;

public class D2to2005
{
public static void main(String args[]) throws Exception
{
/*
크기가 N인 파스칼의 삼각형을 만들어야 한다.

파스칼의 삼각형이란 아래와 같은 규칙을 따른다.

1. 첫 번째 줄은 항상 숫자 1이다.

2. 두 번째 줄부터 각 숫자들은 자신의 왼쪽과 오른쪽 위의 숫자의 합으로 구성된다.

N이 4일 경우,
 



N을 입력 받아 크기 N인 파스칼의 삼각형을 출력하는 프로그램을 작성하시오.

 */
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int triangle=sc.nextInt();
		int[][] arr1=new int[triangle][triangle];

		for (int i = 0; i < triangle; i++) {
			for (int j = 0; j < triangle; j++) {
				arr1[i][j]=0;
			}
		}
		for (int i = 0; i < triangle; i++) {
			arr1[0][i]=1;
		}
		for (int i = 0; i < triangle; i++) {
			arr1[i][0]=1;
		}
		System.out.println("#"+test_case);
		for (int  i= 1;  i< triangle; i++) {
			for (int j = 1; j < triangle; j++) {
				arr1[i][j]=arr1[i-1][j]+arr1[i][j-1];
			}
		}
		System.out.print(arr1[0][0]+" ");
		System.out.println();
		for (int k = 1; k < triangle; k++) {
				for (int j = 0; j <= k; j++) {
					System.out.print(arr1[k-j][0+j]+" ");
				}

				System.out.println();
					
		}
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
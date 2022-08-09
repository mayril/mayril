
import java.util.Scanner;


public class Solution
{

public static void main(String args[]) 
{
/*
 *

10개의 테스트 케이스가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 정사각형 테이블의 한 변의 길이가 주어진다. (이 값은 항상 100이다)

그 다음 줄부터 100 x 100크기의 테이블의 초기 모습이 주어진다. 1은 N극 성질을 가지는 자성체를 2는 S극 성질을 가지는 자성체를 의미하며 테이블의 윗부분에 N극이 아래부분에 S극이 위치한다고 가정한다.

(N극 성질을 가지는 자성체는 S극에 이끌리는 성질이 있다.)

[출력]

#부호와 함께 테스트 케이스의 번호를 출력하고, 공백 문자 후 교착 상태의 개수를 출력한다.
 *  */
	Scanner sc = new Scanner(System.in);

	int T=10;
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int b=sc.nextInt();
		
		int [][] arr=new int[100][100];
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j]==1&&arr[i-1][j]!=0) {
					arr[i-1][j]=arr[i][j];
					arr[i][j]=0;
				}else if(arr[i][j]==2&&arr[i+1][j]!=0){
					arr[i+1][j]=arr[i][j];
					arr[i][j]=0;
				}
			}
		}
		
		System.out.println("#"+test_case+" ");
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}

	
}


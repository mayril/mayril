package swea;

import java.util.Scanner;
/*
 * 달팽이는 1부터 N*N까지의 숫자가 시계방향으로 이루어져 있다.

다음과 같이 정수 N을 입력 받아 N크기의 달팽이를 출력하시오.
 */
public class D2to1954달팽이숫자{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
		int t=1;
		int size = sc.nextInt();
		int[][] arr1= new int[size][size];
		int k =0;
		while(k<size/2+1) {
			
			
				if(t<size*size+1) {
			 		for (int x = k; x < size-k; x++) {	//가로 위1줄	
						arr1[k][x]=t++;
					}
			 		if(t==size*size+1) {
						break;
					}
					
					for (int y = 1+k; y < size-k; y++) {	//세로 오른쪽 1줄
							arr1[y][size-1-k]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int x = size-2-k; x >=0+k; x--) {	// 가로 아래 역 1줄
						arr1[size-1-k][x]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int y = size-2-k; y >=1+k; y--) {		// 세로 왼쪽 역 1줄
						arr1[y][k]=t++;	
					}
					if(t==size*size+1) {
						break;
					}
					
					
				}	
			k++;
			
		}
		
		System.out.println("#"+test_case);
		for(int x = 0; x <size; x++) {
			for(int y = 0; y <size; y++) {
				System.out.print(arr1[x][y]+" ");
			}
			System.out.println();
		}
		/////////////////////////////////////////////////////////////////////////////////////////////
		}	
	}
}

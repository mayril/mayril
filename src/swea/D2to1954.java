package swea;

import java.util.Scanner;
/*
 * ?��?��?��?�� 1�??�� N*N까�??�� ?��?���? ?��계방?��?���? ?��루어?�� ?��?��.

?��?���? 같이 ?��?�� N?�� ?��?�� 받아 N?��기의 ?��?��?���? 출력?��?��?��.
 */
public class D2to1954{
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
			 		for (int x = k; x < size-k; x++) {	//�?�? ?��1�?	
						arr1[k][x]=t++;
					}
			 		if(t==size*size+1) {
						break;
					}
					
					for (int y = 1+k; y < size-k; y++) {	//?���? ?��른쪽 1�?
							arr1[y][size-1-k]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int x = size-2-k; x >=0+k; x--) {	// �?�? ?��?�� ?�� 1�?
						arr1[size-1-k][x]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int y = size-2-k; y >=1+k; y--) {		// ?���? ?���? ?�� 1�?
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

package swea;

import java.util.Scanner;
/*
 * ?¬?½?΄? 1λΆ??° N*NκΉμ?? ?«?κ°? ?κ³λ°©?₯?Όλ‘? ?΄λ£¨μ΄? Έ ??€.

?€?κ³? κ°μ΄ ? ? N? ?? ₯ λ°μ N?¬κΈ°μ ?¬?½?΄λ₯? μΆλ ₯???€.
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
			 		for (int x = k; x < size-k; x++) {	//κ°?λ‘? ?1μ€?	
						arr1[k][x]=t++;
					}
			 		if(t==size*size+1) {
						break;
					}
					
					for (int y = 1+k; y < size-k; y++) {	//?Έλ‘? ?€λ₯Έμͺ½ 1μ€?
							arr1[y][size-1-k]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int x = size-2-k; x >=0+k; x--) {	// κ°?λ‘? ?? ?­ 1μ€?
						arr1[size-1-k][x]=t++;

					}
					if(t==size*size+1) {
						break;
					}
					
					for (int y = size-2-k; y >=1+k; y--) {		// ?Έλ‘? ?Όμͺ? ?­ 1μ€?
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

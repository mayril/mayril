package bakjoon;

import java.util.Scanner;


public class Baek1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		소수찾기
		 */
		
		int n=sc.nextInt();	//n 입력
		int count=0;		//소수의 갯수
		int[] arr1=new int[n]; 
		for (int i = 0; i < n; i++) {
			arr1[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr1.length; i++) { // n< i<=2n
			boolean num=true;
			
			if (arr1[i]!=1) {
				for (int j = 2; j <= arr1[i]/2; j++) {
					if (arr1[i]%j==0) {
						num=false;
					}	
				}
			}else {
				num=false;
			}
			
			if (num==true) {
				count++;
			}
		}
		System.out.println(count);
			

		
		//-----------------------
	}
	
}

package bakjoon;

import java.util.Scanner;


public class Baek1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int []arr=new int[a];
		for (int i = 0; i < a; i++) {
			arr[i]=sc.nextInt();
		}
		int cnt=0;
	
		int max=0; //약수의 최대값
		int min=arr[0];//약수의 최소값
		for (int i = 0; i < a; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min=arr[i];
			}
			
		}
		
		System.out.println(min*max);
		//-----------------------
	}
	
}

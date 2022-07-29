package bakjoon;

import java.util.Scanner;


public class Baek2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int tmp=0;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[i]) {
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		//-----------------------
	}
	
}

package codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 숌은 짐을 챙겨서 겨울캠프에서 집으로 가려고 한다. 근데 숌은 공부를 많이 하러 캠프에 온 것이기 때문에 책을 엄청나게 많이 가지고 왔다. 숌은 이 책을 방에 탑처럼 쌓아 놨다.

숌은 책을 박스에 차곡차곡 넣어서 택배로 미리 보내려고 한다. 책은 탑처럼 차곡차곡 쌓여있기 때문에, 차례대로 박스에 넣을 수밖에 없다.

각각의 책은 무게가 있다. 그리고 박스는 최대 넣을수 있는 무게가 있다. 숌이 필요한 박스의 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=sc.nextInt();
		int m=sc.nextInt();
		int sum=0;
		int cnt=1;
		
		int [] arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Arrays.sort(arr);
		
		for (int i = n-1; i >=0; i--) {
			System.out.println(sum);
			if (sum<=m) {
				sum+=arr[i];
			}else {
				sum=0;
				cnt++;
				i++;
				}
			
		}
		if (n==0) {
			System.out.println(0);
		}else {
			System.out.println(cnt);
		}
		
		//-----------------------
	}

	
	
}

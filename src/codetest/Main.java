package codetest;

import java.util.Scanner;

/*
 * 두 정수 N과 F가 주어진다. 지민이는 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다. 만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.

예를 들어, N=275이고, F=5이면, 답은 00이다. 200이 5로 나누어 떨어지기 때문이다. N=1021이고, F=11이면, 정답은 01인데, 1001이 11로 나누어 떨어지기 때문이다.
 * */

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
			int ab=a/100; //100으로나눈후
			int abc=ab*100;//100곱해서 뒤 두자릿수 초기화
			for (int i = 0; i <= 99; i++) { //0부터 99까지
				if ((abc+i)%b==0) { //b로 나눠지면
					System.out.println(String.valueOf(abc+i).substring(String.valueOf(abc+i).length()-2, String.valueOf(abc+i).length()));//뒤의 두자리를 구해
					break;//값을 찾으면 반복 중지
				}
			}
		
		//-----------------------
	}
	
}

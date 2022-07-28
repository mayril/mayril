package codetest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		while (n!=0) { //n이 0이아닐떄
			n=sc.nextInt(); // n 입력
			if (n==0) { //0이입력되면 종료
				break;
			}
			int len=String.valueOf(n).length(); //n의길이
			int leng=2+len*3+(len-1);  			//n을 이루는 수가 모두3의 너비를 가질때
			
			for (int i = 0; i < String.valueOf(n).length(); i++) {
				if (String.valueOf(n).charAt(i)=='1') {		//n의 자릿수중 1이있으면
					leng-=1;							// -1
				}else if (String.valueOf(n).charAt(i)=='0') { //n의 자릿수중 0이있으면
					leng+=1;							//+1
				}
			}
			
			System.out.println(leng);		//길이 출력
		}
		
		//-----------------------
	}
	
}

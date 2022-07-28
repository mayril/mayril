package bakjoon;

import java.util.Scanner;


public class Baek1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;	//하얀칸 위의 말 수
		String input=""; //입력
		int kcnt=0;
		for (int i = 0; i < 8; i++) {
			input+=sc.nextLine(); //입력		
		}
		
		String[] k=input.split(""); //입력한 문자열을 나눔

		
		String[][] chess=new String[9][9];// 0,0은 비우고 1,1부터 채움
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				chess[i][j]=k[kcnt++];// chess배열에 k값넣음

			}

		}
		
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				if((i+j)%2==0) {		// 좌표합이짝수면 하얀칸
					if (chess[i][j].equals("F")) { //하얀칸위에 말이 있으면
						count++;	//count 에 1을 더함
					}
					
				}
			}
		}
		
		System.out.println(count);
		//-----------------------
	}
	
}

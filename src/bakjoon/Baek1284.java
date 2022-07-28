package bakjoon;

import java.util.Scanner;


public class Baek1284 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=1;
		while (n!=0) {
			n=sc.nextInt();
			if (n==0) {
				break;
			}
			int len=String.valueOf(n).length();
			int leng=2+len*3+(len-1);
			
			for (int i = 0; i < String.valueOf(n).length(); i++) {
				if (String.valueOf(n).charAt(i)=='1') {
					leng-=1;
				}else if (String.valueOf(n).charAt(i)=='0') {
					leng+=1;
				}
			}
			
			System.out.println(leng);
		}
		
		//-----------------------
	}
	
}

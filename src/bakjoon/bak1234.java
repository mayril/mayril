package bakjoon;

import java.util.Scanner;

public class bak1234 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int num=sc.nextInt();
		int num2=0;
		int num3=0;
		int result=num;
		int brid=0;
		do {
			if(result<10) {
				result=result*11;
			}else {
				num2=result/10+result%10;
				num3=result%10;
				result=num2%10+num3*10;

				
			}
			brid+=1;
		} while (result!=num);
		
		System.out.println(brid);
		
		
	}
	
}

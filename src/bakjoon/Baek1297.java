package bakjoon;

import java.util.Scanner;


public class Baek1297 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cross=sc.nextInt();
		double height=sc.nextDouble(); //높이비
		double width=sc.nextDouble(); //넓이 비
		
		double cross2=height*height+width*width; //대각선비율 의 제곱
		cross2=Math.sqrt(cross2); //대각선비율의 제곱근
		double num=cross/cross2; //대각선/대각선의 비율 
		height=height*num; //얻은 비율을 비율에 곱
		width=width*num;
		System.out.print((int)height+" ");//정수화
		System.out.print((int)width);
		//-----------------------
	}
	
}

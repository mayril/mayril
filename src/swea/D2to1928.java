package swea;

import java.util.Base64;
import java.util.Scanner;
/*
입력으로 Base64 Encoding 된 String 이 주어졌을 때, 해당 String 을 Decoding 하여, 원문을 출력하는 프로그램을 작성하시오.

 */
public class D2to1928{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
	

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String b64=sc.next();
			byte[] decodedBytes=Base64.getDecoder().decode(b64);
			String decodedString = new String(decodedBytes);
			System.out.println("#"+test_case+" "+decodedString);
		/////////////////////////////////////////////////////////////////////////////////////////////
		}	
	}
}

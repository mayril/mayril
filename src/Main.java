

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {


	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		//StringBuilder sb=new StringBuilder();
		int n= sc.nextInt();
		int result=1;
		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		
		System.out.println(result);
		//-----------------------
	}

}

package Test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Test2{
	static int[][] chess;
public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner sc = new Scanner(System.in);
	int T=Integer.parseInt(br.readLine());
	//int T=10;
	for(int test_case = 1; test_case <= T; test_case++){
		//StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(br.readLine());
		chess=new int[n][n];
		boolean[] q=new boolean[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					
				} 
				if (q[i]) {
					chess[i][j]=1;
					q[i]=false;
				}		
			}
		}
		
	
	}
}

	public static void queen() {
		
	}
}


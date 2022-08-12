

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		
		int width=sc.nextInt();
		int height=sc.nextInt();
		int store=sc.nextInt();
		int []arr =new int[store];
		int dgPos=0;
		int sum=0;
		for (int i = 0; i <= store; i++) {
			int tmpPos=0;
			int posS=sc.nextInt();
			int posL=sc.nextInt();

			if (posS==1) {
				tmpPos=posL;
			}else if (posS==2) {
				tmpPos=2*width+height-posL;
			}else if (posS==3) {
				tmpPos=2*width+2*height-posL;
			}else if (posS==4) {
				tmpPos=posL+width;
			}
			if (i<store) {
				arr[i]=tmpPos;
			}else {
				dgPos=tmpPos;
			}
			
		}
		
		for (int i = 0; i < store; i++) {
			int cloak=dgPos-arr[i];
			if (cloak>0) {
				cloak=dgPos-arr[i];
			}else {
				cloak=cloak*(-1);
			}
			int anticloak= 2*width+2*height-cloak;
			if (cloak>=anticloak) {
				sum +=anticloak;
			}else {
				sum+=cloak;
			}
		}
		
		System.out.println(sum);
		//	1
		//3   4
		//	2
		br.close();
		bw.close();
		//-----------------------
	}
	
}

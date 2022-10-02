

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main{

public static void main(String args[]) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st=new StringTokenizer(br.readLine());
	Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	
	int start=Integer.parseInt(st.nextToken());
	int end=Integer.parseInt(st.nextToken());
	int[] arr=new int[end];
	for (int j=1; j<end; j++) {
		arr[j]=j+1;
		
	}
	for (int i = 2; i <= end/2; i++) {
		for (int j = i; j < end; j++) {
			if (arr[j]==0) {
				continue;
			}
			if (arr[j]%i==0) {
				arr[j]=0;
			}
		}
		
	}
	for (int i = start-1; i < end; i++) {
		if (arr[i]!=0) {
			sb.append(arr[i]).append("\n");
		}
		
	}
	
	System.out.println(sb);
	
	
	}

	

}


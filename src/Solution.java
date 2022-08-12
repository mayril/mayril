

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Solution
{
		public static int[] arr2;
		public static int max = 0;
public static void main(String args[]) throws NumberFormatException, IOException 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		max=0;
		String k=sc.next();	//숫자 입력값
		int time=sc.nextInt(); //교환횟수
		String[] arr=k.split("");	
		arr2=new int[arr.length];
		// 자릿수 나눠서 배열에 집어넣음
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=Integer.parseInt(arr[i]);
		}

		dfs(0, 0, time);
		
		System.out.println("#" + test_case + " " + max);
	/////////////////////////////////////////////////////////////////////////////////////////////	
	}
	}
	public static void change(int a,int b) {
		int tmp=0;
		tmp=arr2[a];
		arr2[a]=arr2[b];
		arr2[b]=tmp;
	}
	
	public static void dfs(int index,int cnt,int time) {		
		if (time==cnt) {
			StringBuffer sb = new StringBuffer();
            for(int i : arr2)
                sb.append(i);
            // 최대값 비교
            max = Math.max(max, Integer.parseInt(sb.toString()));
            return;
		}
		//전 범위 탐색 (시작 인덱스 ~ 끝)
		for (int i = index; i < arr2.length-1; i++) {
			 // 전 범위 탐색(시작 + 1 ~ 끝)
			for (int j = i+1; j < arr2.length; j++) {
				if(arr2[i] <= arr2[j]) {
					change(i, j);
					//for (int j2 = 0; j2 < arr2.length; j2++) {
					//	System.out.print(arr2[j2]);
					//}
					//System.out.println();
					dfs(i, cnt+1, time);	
					//System.out.println(max);
					
					change(i, j);
				}
			}
		}
	}

	
}


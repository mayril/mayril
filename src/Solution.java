

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
import java.util.StringTokenizer;


public class Solution{

public static void main(String args[]) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	Scanner sc = new Scanner(System.in);

	int T=Integer.parseInt(br.readLine());
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int k=Integer.parseInt(st.nextToken());
		int []customer=new int[n]; //손님이 오는 시간
		String result="";
		boolean po=true; //while문 탈출용
		boolean ip=true; //결과값 T/F구분
		int bread=0; //빵의 갯수
		int max=0; //가장 늦게 오는 손님의 시간
		int cnt=0; // 시간초
		st=new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			customer[i]=Integer.parseInt(st.nextToken());
			if (max<customer[i]) { //가장 늦게 오는 손님
				max=customer[i];
			}
		}
		

		while (po) {
			if (cnt>=m&&cnt%m==0) {
				bread+=k; //빵이 m초마다 k개 씩 추가
			}
			for (int j = 0; j < customer.length; j++) {
				if (customer[j]==cnt) { //손님이 해당하는 시간에오면 붕어빵--
						bread--;
				}
			}
			//System.out.println(bread);
			if (bread<0) { //빵을 제공할수없으면 impossible
				ip=false;
			}
			
			if (cnt==max) {//손님이 다왔다면 while문 탈출
				po=false;
			}
			cnt++;
		}
		
		if (ip) {
			result="Possible";
		}else {
			result="Impossible";
		}

		System.out.println("#" + test_case + " "+result);
	/////////////////////////////////////////////////////////////////////////////////////////////	
	}
	}


}


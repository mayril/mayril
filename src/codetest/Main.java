package codetest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int arr[][] = new int[501][501];
		int xlocation = 499;
		int ylocation = 499;
		int sum = 0;
		int dr = 0;
		int dt = 0;
		int K = Integer.parseInt(br.readLine());
		for(int i = 0; i<6; i++) {
			st = new StringTokenizer(br.readLine());
			dr = Integer.parseInt(st.nextToken());
			dt = Integer.parseInt(st.nextToken());
			switch(dr) {
			case 1:
				for(int a = 0; a<dt-1; a++) {
					arr[ylocation][xlocation] = 1;
					xlocation++;
				}
				break;
			case 2:
				for(int a = 0; a<dt-1; a++) {
					arr[ylocation][xlocation] = 1;
					xlocation--;
				}
				break;
			case 3:
				for(int a = 0; a<dt-1; a++) {
					arr[ylocation][xlocation] = 1;
					ylocation++;
				}
				break;
			case 4:
				for(int a = 0; a<dt-1; a++) {
					arr[ylocation][xlocation] = 1;
					ylocation--;
				}
				break;
			}
		}
		for(int i = 1; i<arr.length-1; i++) {
			for(int j = 1; j<arr[i].length-1; j++) {
				if(arr[i][j-1]==1) { //전칸이 1이면
					arr[i][j] = 1; //다음칸이 1로 저장됨 (넓이를 구하기 위해 내부칸을 전부 색칠하기 위함.)
				}
				if(arr[i][j] == 1) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		System.out.println(sum*K);
	}
}
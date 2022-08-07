package codetest;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stu=sc.nextInt();
		
		int[][] classone=new int[stu][5];
		int[] cnt=new int[stu];
		for (int i = 0; i < stu; i++) {
			for (int j = 0; j < 5; j++) {
				classone[i][j]=sc.nextInt();
			}
		}
		int t=0;
		
			for (int i = 0; i < stu; i++) {
					for (int j = 0; j < stu; j++) {
						for (int h = 0; h < 5; h++) {
						if (classone[i][h]==classone[j][h]) {
							cnt[i]++;
							break;
						}
					}
			}
		}


		int max=0;
		int maxt=0;
		for (int i = 0; i < cnt.length; i++) {
			if(cnt[i]>maxt) {
				maxt=cnt[i];
				max=i;
			}
		}
		System.out.println(max+1);
		//-----------------------
	}
	
}

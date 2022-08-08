package codetest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		
		int cnt=0;
		
		for (int i = 0; i < y; i++) {
			String sw=sc.next();
			int k=sw.length();
			String[] arr1=sw.split("");
			boolean t=true;
			
			
		
			for (int j = 0; j < k; j++) {
				for (int j2 = j+1; j2 < k; j2++) {
					if (!arr1[j].equals(arr1[j2])) {
						for (int l = j2+1; l < k; l++) {
							if (arr1[l].equals(arr1[j])) {
								t=false;
							}		
						}				
					}
				}
			}
			

			if (t) {
				cnt++;
			}
			
		}
		
		System.out.println(cnt);
		//-----------------------
	}

	
	
}

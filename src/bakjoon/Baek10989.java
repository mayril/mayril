package bakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 
 */
public class Baek10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt=new int[10001];
		
		int n=Integer.parseInt(br.readLine());
		 for (int i = 0; i < n; i++) {
	            // 해당 인덱스의 값을 1 증가
	            cnt[Integer.parseInt(br.readLine())] ++;
	        }
		 
		br.close();
		
		 StringBuilder sb = new StringBuilder();

		

		 for(int i = 1; i < 10001; i++){
	            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
	            while(cnt[i] > 0){
	                sb.append(i).append('\n');
	                cnt[i]--;
	            }
	        }
	        System.out.println(sb);
		
		
		//-----------------------
	}

	
	
}

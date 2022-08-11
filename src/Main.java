

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/* */
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc=new Scanner(System.in);
		
		int swicnt=Integer.parseInt(br.readLine());
		int[] swi=new int[swicnt];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for (int i = 0; i < swicnt; i++) {
			swi[i]=Integer.parseInt(st.nextToken());
		}
		int stu=Integer.parseInt(br.readLine());

		for (int i = 0; i < stu; i++) {
			st=new StringTokenizer(br.readLine());
			int gender=Integer.parseInt(st.nextToken());
			int sit=Integer.parseInt(st.nextToken());
			
			if (gender==1) {
				for (int j = 0; j < swicnt; j++) {
					if ((j+1)%sit==0) {
						swi[j] = swi[j] == 0 ? 1 : 0;
					}
				}
			}else {
				swi[sit-1] = swi[sit-1] == 0 ? 1 : 0;
				for(int j=1; j<swicnt/2; j++) {
					if(sit-1+j >= swicnt || sit-1-j < 0)
						break;
					if(swi[sit-1-j] == swi[sit-1 + j]) {
						swi[sit-1-j] = swi[sit-1-j] == 0 ? 1 : 0;
						swi[sit-1+j] = swi[sit-1+j] == 0 ? 1 : 0;
					}
					else break; 
				}
			}
		}
		
		for (int j = 0; j < swi.length; j++) {
			bw.write(String.valueOf(swi[j])+" ");
			if ((j+1)%20==0) {
				bw.write("\n");
			}
		}
		br.close();
		bw.close();
		//-----------------------
	}
	


	
	
}

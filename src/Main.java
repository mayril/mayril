

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//Scanner sc = new Scanner(System.in);
		StringTokenizer st=new StringTokenizer(br.readLine());
		int w=Integer.parseInt(st.nextToken());
		int h=Integer.parseInt(st.nextToken());
		st=new StringTokenizer(br.readLine());
		int x=Integer.parseInt(st.nextToken());
		int y=Integer.parseInt(st.nextToken());
		int time=Integer.parseInt(br.readLine());
		int fx=x;
		int fy=y;
		int direction=1;
		
		for (int i = 0; i < time; i++) {
			if (direction==1) {
				fx+=1;
				fy+=1;
			}else if (direction==2) {
				fx-=1;
				fy-=1;
			}else if (direction==3) {
				fx-=1;
				fy+=1;
			}else if (direction==4) {
				fx+=1;
				fy-=1;
			}
			if (fx==w&&fy==h||fx==w&&fy==0||fx==0&&fy==0||fx==0&&fy==h) {
				if (direction==1) {
					direction=2;
				}else if (direction==2) {
					direction=1;
				}else if (direction==3) {
					direction=4;
				}else if (direction==4) {
					direction=3;
				}
			}else {
				if (fx==w) {
					if (direction==1) {
						direction=3;
					}else {
						direction=2;
					}
				}else if (fx==0) {
					if (direction==2) {
						direction=3;
					}else {
						direction=1;
					}
				}else if (fy==h) {
					if (direction==1) {
						direction=4;
					}else {
						direction=2;
					}
				}else if (fy==0) {
					if (direction==4) {
						direction=1;
					}else {
						direction=3;
					}
				}
			}
			System.out.println(fx+" "+fy);
		}
		
		System.out.println(fx+" "+fy);
		//-----------------------
	}

}

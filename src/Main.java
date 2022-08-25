import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
		static int [][] arr;
		static int color;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		//StringTokenizer st=new StringTokenizer(br.readLine());
		//StringBuilder sBuilder=new StringBuilder();
		arr=new int[19][19];
		int win=0;
		int winx=0;
		int winy=0;
		int winc=0;
		for (int i = 0; i < 19; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int j = 0; j < 19; j++) {
				arr[i][j]=Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j]==1||arr[i][j]==2) {
					color=arr[i][j];
					System.out.println(color);
					//if (gett(i, j)) {
						if (check(i, j)) {
							winx=i;
							winy=j;
							winc=color;
						}
					//}
				}
			}	
		}
		
		System.out.println(winc);
		System.out.println(winx+" "+winy);
		

	}//main-end
	
	public static boolean gett(int i,int j) {

		if (arr[i][j-1]!=color) {
			return false;
		}else if (arr[i-1][j]!=color) {
			return false;
		}else if (arr[i-1][j-1]!=color) {
			return false;
		}else if (arr[i-1][j+1]!=color) {
			return false;
		}

		return true;
	}
	
	private static boolean check(int i,int j) {
		int[] dr={1,0,-1,1};
		int[] dc={0,1,-1,-1};

		for (int k = 0; k < 4; k++) {
			int count=1;
				int posx=i;
				int posy=j;
			while (true) {
				posx=i+dr[k];
				posy=j+dc[k];
				if (posx>0||posx<19||posy>0||posx<19) {
					if (arr[posy][posx]==color) {
						count++;
					}else {
						break;
					}
				}else {
					break;
				}
			}
			
			if (count==5) {
				return true;
			}
		}

		return false;
		
	}

}//class-end
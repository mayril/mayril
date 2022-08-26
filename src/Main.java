import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
		static int[][] arr;
		static int k,c,r;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		StringTokenizer st=new StringTokenizer(br.readLine());
		//int n=Integer.parseInt(br.readLine());
		//StringBuilder sBuilder=new StringBuilder()
		c=Integer.parseInt(st.nextToken());
		r=Integer.parseInt(st.nextToken());
		arr=new int[c][r];
		int size=0;
		
		for (int i = 0; i < c; i++) {
			String[] arr2=br.readLine().split("");
			for (int j = 0; j < r; j++) {
				arr[i][j]=Integer.parseInt(arr2[j]);
			}
		}
		

		k=0;
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				dia(i, j); 
			}
		}
		System.out.println(k);
	}//main-end
	
	public static void dia(int i,int j) {
		int g=0;
		if (r>c) {
			g=c;
		}else {
			g=r;
		}
		boolean t=true;
		while (t) {
			for (int y = k; y <= g/2 ; y++) {
				if (i+k<c&&j+k<r&&i-k>=0&&j-k>=0) {
					if (arr[i+k][j]==1&&arr[i][j+k]==1&&arr[i-k][j]==1&&arr[i][j-k]==1) {
						for (int l = 0; l < k-2; l++) {
							if (arr[i+l][j-k+l]!=1) {
								return;
							}
						}
						for (int l = 0; l < k-2; l++) {
							if (arr[i-k+l][j+l]!=1) {
								return;
							}				
						}
						for (int l = 0; l < k-2; l++) {
							if (arr[i+l][j+k-l]!=1) {
								return;
							}
						}
						for (int l = 0; l < k-2; l++) {
							if (arr[i+k-l][j+l]!=1) {
								return;
							}
						}
						if (t) {
							System.out.println("i"+i+"J"+j);
							k=y;
							System.out.println(k);
						}
					}else 
						return;
					
				}else 
					return;
			}
		}
		return;
	}
}//class-end
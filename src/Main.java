
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
	
		static int[] arr;
		static boolean[] visit;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		StringTokenizer st=new StringTokenizer(br.readLine());	
		//int a=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		arr=new int[m];
		visit=new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i+1;
		}
		int start=0;
		System.out.println(visit[0]);
		get(n, m,start);
		System.out.println();
		//-----------------------
	}
	

	public static void get(int n,int m,int start) {
		if (start>=m) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visit[i]==false) {
				visit[i]=true;
				arr[start]=i+1;
				get(n, m, start+1);
				visit[i]=false;
			}
			
		}
		
	}
	
	
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Test {
	static boolean[] check;
	static int[][] arr;
	static int N,M,V;
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		V=Integer.parseInt(st.nextToken());
		
		arr = new int[M+1][M+1];
		check = new boolean[M+1];
		
		for (int i = 0; i < M; i++) {
			st=new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] =  1;
		}
		//-----------------------
	}
	
	public static void dfs(int index,int deep) {
		
	}
	
	public static void bfs(int index,int branch) {
		
	}

}
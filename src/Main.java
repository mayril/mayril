import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
		static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		//StringTokenizer st=new StringTokenizer(br.readLine());
		//int n=Integer.parseInt(br.readLine());
		//StringBuilder sBuilder=new StringBuilder();
		for (int i = 0; i < 4; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			int q=Integer.parseInt(st.nextToken());
			// p,y x,q
			int x1=Integer.parseInt(st.nextToken());
			int y1=Integer.parseInt(st.nextToken());
			int p1=Integer.parseInt(st.nextToken());
			int q1=Integer.parseInt(st.nextToken());
			// x,q p,y
			if (x1>p||p1<x||y1>q||q1<y) {
				System.out.println("d");
			}else if ((p==x1&&q==y1)||(p==x1&&y==q1)||(x==p1&&y==q1)||(x==p1&&q==y1)) {
				System.out.println("c");
			}else if (p==x1||p1==x||y==q1||q==y1) {
				System.out.println("b");
			}else {
				System.out.println("a");
			}
		}
		
		
		
		System.out.println();
	}//main-end
}//class-end
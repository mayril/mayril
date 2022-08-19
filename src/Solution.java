
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Solution{
	static int[] arr;
	static int count,k,sum,n;
	static LinkedList<Integer> linkedList;
	static boolean[] visit;
public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner sc = new Scanner(System.in);
	int T=Integer.parseInt(br.readLine());
	//int T=10;
	for(int test_case = 1; test_case <= T; test_case++){
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		count=0;
		arr= new int[n];
		visit=new boolean[n];
		st=new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		get(0, 0);

		int sum=0;
		System.out.println("#"+test_case+" "+count);
	}
	
	
}
	public static void get(int a, int cnt) {
		cnt++;
		int tmp=sum;

		if (sum==k) {
			count++;
			return;
		}
		if (cnt==n) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
		if (visit[i]==false) {
			visit[i]=true;
			sum+=arr[i];
			get(a+1, cnt);
			visit[i]=false;
		}		
		}
	} 
}


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Solution{

public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner sc = new Scanner(System.in);
	int T=Integer.parseInt(br.readLine());
	//int T=10;
	for(int test_case = 1; test_case <= T; test_case++){
		Stack<String>stack=new Stack<>();
		String k=br.readLine();
		String[] arr=k.split("");
		int sum=0;
		int t=1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("(")) {
				stack.push("(");
				sum++;
			}else {
				stack.pop();
				sum--;
				sum+=stack.size();
			}
			System.out.println(sum);
		}
		//(((1(11))(1)1))(11)
		System.out.println("#"+test_case+" "+sum);
	}

	}
}


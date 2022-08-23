
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
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc=new Scanner(System.in);
		//StringTokenizer st=new StringTokenizer(br.readLine());
		//StringBuilder sBuilder=new StringBuilder();
		int n=Integer.parseInt(br.readLine());
		String maxP="";
		int revolsum=0;
		int maxR=0;
		//String result="";
		for (int i = 0; i < n; i++) {
			String Poke=br.readLine();
			StringTokenizer st=new StringTokenizer(br.readLine());
			int revol=Integer.parseInt(st.nextToken());
			int candy=Integer.parseInt(st.nextToken());
			int sum=0;	
			boolean t=true;
			while (t) {
				sum+=candy/revol;
				if (candy%revol+(candy/revol)*2>=revol) {
					candy=candy%revol+(candy/revol)*2;
				}else {
					t=false;
				}
			}
			if (sum>maxR) {
				maxP=Poke;
				maxR=sum;
			}
			revolsum+=sum;
		}

		
		System.out.println(revolsum);
		System.out.println(maxP);
		//-----------------------
	}
	

	
	
	
}
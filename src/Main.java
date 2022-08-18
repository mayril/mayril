
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc = new Scanner(System.in);
		StringTokenizer stringTokenizer=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(stringTokenizer.nextToken());
		int k=Integer.parseInt(stringTokenizer.nextToken());
		int [] arr=new int[n];

		for (int i = 0; i < n; i++) {
			arr[i]=i+1;
		}
	
		System.out.print("<");
		int index=0;
		int index2=0;
		
		do {
			index2=index2%n;
			int tmp=arr[index2];
			
			if (arr[index2]!=0) {
				index++;
				if (index%k==0&&index!=n*k) {
					System.out.print(tmp+","+" ");
					arr[index2]=0;
				}else if (index%k==0&&index==n*k) {
					System.out.print(tmp);
					break;
				}
			}
			index2++;			
		} while (index<=n*k);
		
		System.out.println(">");
		//  2 4 2 4 2 0 0
		//-----------------------
	}


}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
 
public class Test{

public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    int T=Integer.parseInt(br.readLine());
    //int T=10;
    for(int test_case = 1; test_case <= T; test_case++){
    	StringTokenizer st=new StringTokenizer(br.readLine());
    	int n=Integer.parseInt(st.nextToken());
    	int m=Integer.parseInt(st.nextToken());
    	int [][] arr=new int[n+1][n+1];
    	for (int i = 0; i < m; i++) {
    		st=new StringTokenizer(br.readLine());
    		int y=Integer.parseInt(st.nextToken());
    		int x=Integer.parseInt(st.nextToken());
    		int color=Integer.parseInt(st.nextToken());
		}
		System.out.println("#"+test_case+" ");
		
    }//for_end
}//main_end
	
}//class_end
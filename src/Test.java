import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
 
public class Test{
    static int[] arr;
    static int n,count;
    static boolean [] check;
    
public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    int T=Integer.parseInt(br.readLine());
    //int T=10;
    for(int test_case = 1; test_case <= T; test_case++){
		//StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		arr=new int[n];
		check=new boolean[n];
		queen(0);
		System.out.println("#"+test_case+" "+count);
    }//for_end
}//main_end

	public static void queen(int x) {
		
		
	}
 
}//class_end
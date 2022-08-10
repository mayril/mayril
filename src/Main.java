

import java.util.Scanner;

/* */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			int start=sc.nextInt();
			int end=sc.nextInt();
			int travel=start;
			int length=0;
			int cnt=0;
			while (travel<=(end-1)) {
				
					length+=1;
					travel+=length;
					cnt++;
				
			}
			
			System.out.println(cnt+1);
			
		}
		
		//-----------------------
	}

	
	
}

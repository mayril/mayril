import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
 
public class Solution{

public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Scanner sc = new Scanner(System.in);
    int T=Integer.parseInt(br.readLine());
    //int T=10;
    for(int test_case = 1; test_case <= T; test_case++){
		//StringTokenizer st=new StringTokenizer(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		String [][] arr=new String[n][n];
		String result="NO";
		int count=0;
		for (int i = 0; i < n; i++) {
			String[] sp=br.readLine().split("");
			for (int j = 0; j < n; j++) {
				arr[i][j]=sp[j];
			}
		}
		
		//가로 
		for (int i = 0; i < n; i++) {
			count=0;
			for (int j = 0; j < n; j++) {
				if (arr[i][j].equals("o")) {
					count++;
					if (count>=5) {
						result="YES";
					}
				}else {
					count=0;
				}
			}
		}
		//세로
		for (int i = 0; i < n; i++) {
			count=0;
			for (int j = 0; j <n; j++) {
				
				if (arr[j][i].equals("o")) {
					count++;
					if (count>=5) {
						result="YES";
					}
				}else {
					count=0;
				}
			}	
		}
		//대각선
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//대각선 \ 방향
				count=0;
				if (arr[i][j].equals("o")) {
					for (int i2 = 0; i2 < n; i2++) {
						for (int j2 = 0; j2 < n; j2++) {
							if ((i-i2)==(j-j2)) {
								if (arr[i2][j2].equals("o")) {
									count++;
									if (count>=5) {
										result="YES";
									}
								}else {
									count=0;
								}
							}
						}
					}
					
					count=0;
					for (int i2 = 0; i2 < n; i2++) {
						for (int j2 = 0; j2 < n; j2++) {
							if ((i-i2)==-(j-j2)) {
								if (arr[i2][j2].equals("o")) {
									count++;
									if (count>=5) {
										result="YES";
									}
								}else {
									count=0;
								}
							}
						}
					}
				}
				
				
				//대각선 /방향
				
			}
		}
		
		
		
		System.out.println("#"+test_case+" "+result);
    }//for_end
}//main_end
	
}//class_end
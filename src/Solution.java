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
	    String result="DIFF";
	    
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    String a=st.nextToken();
	    String[] arr1=new String[a.length()];
	    arr1=a.split("");
	    String b=st.nextToken(); 
	    String[] arr2=new String[b.length()];
	    arr2=b.split("");
	    for (int i = 0; i < arr1.length; i++) {
	    	String k=arr1[i];
			switch (k) {
			case "C": case "E":case "F":case "G":case "H":case "I":case "J":case "K":case "L":case "M":
			case "N": case "S":case "T":case "U":case "V":case "W":case "X":case "Y":case "Z":
				arr1[i]="a";
				break;

			case "A": case "D": case  "O": case  "P": case "Q": case "R":
				arr1[i]="b";
				break;
			case "B":
				arr1[i]="c";
				break;
			}
		}
	    
	    for (int i = 0; i < arr2.length; i++) {
	    	String k=arr2[i];
			switch (k) {
			case "C": case "E":case "F":case "G":case "H":case "I":case "J":case "K":case "L":case "M":
			case "N": case "S":case "T":case "U":case "V":case "W":case "X":case "Y":case "Z":
				arr2[i]="a";
				break;

			case "A": case "D": case "O": case "P": case "Q": case "R":
				arr2[i]="b";
				break;
			case "B":
				arr2[i]="c";
				break;
			}
		}

	   
	    if (arr1.length==arr2.length) {
	    	result="SAME";
			for (int i = 0; i < arr2.length; i++) {
				if (!arr1[i].equals(arr2[i])) {
					result="DIFF";
				}
			}
		}
	    
	    System.out.println("#"+test_case+" "+result);
    }//for_end
	
}//main_end
	
	
}//class_end
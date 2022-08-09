package swea;
import java.util.Scanner;

public class D2to1926
{
public static void main(String args[]) throws Exception
{
	
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();
	
	
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		String _sam="";
		String tcstring= String.valueOf(test_case);
		String[] arr1 = new String[tcstring.length()];
		int correct=0;
	
		arr1= tcstring.split("");
				
		for (int i = 0; i < tcstring.length(); i++) {
			if(arr1[i].equals("3")||arr1[i].equals("6")||arr1[i].equals("9")) {
				_sam+="-";
				correct=1;
			}
		}
		if(correct==1) {
			tcstring="";
		}
		System.out.print(_sam+tcstring+" ");
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
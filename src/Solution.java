

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Solution
{

public static void main(String args[]) throws NumberFormatException, IOException 
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int answer=0;
		String k=sc.next();
		int time=sc.nextInt();
		String[] arr=k.split("");
		int[]arr2=new int[arr.length];
		int max=0;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=Integer.parseInt(arr[i]);
		}

		for (int i = 0; i < time; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (max<arr2[j]) {
					max=arr2[j];
				}
			}
		}
		
		
		System.out.println("#"+test_case+" "+answer);
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}

	
	}

	
}


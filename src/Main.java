

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner sc = new Scanner(System.in);
		
		//int t=Integer.parseInt(br.readLine());
		String ad=br.readLine();
		String [] add=ad.split("");
		for (int i = 0; i < add.length; i++) {
			if (add[i].equals("+")) {
				
			}else {
				System.out.print(add[i]);
			}
		}
		
		//-----------------------
	}

}

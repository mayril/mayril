

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		int [] arr=new int[n];
		int [] countarr=new int[8001];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
			countarr[arr[i]+4000]++;
		}
		
		int [] arr3=arr;
		Arrays.sort(arr3);
		int max=arr3[n - 1];
		int min= arr3[0];
		int maxarr=0;
		int bin=0;
		boolean flag = false;
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			if(countarr[i] > 0) {

				if(maxarr < countarr[i]) {
					maxarr = countarr[i];
					bin = i - 4000;
					flag = true;
				}
				else if(maxarr == countarr[i] && flag == true) {
					bin = i - 4000;
					flag = false;					
				}
			}
		}

		
		double sum=0;
		for (int i : arr) {
			sum+=i;
		}

		System.out.println((int)Math.round((double)sum/n));
		
		System.out.println(arr[n/2]);
		
		System.out.println(bin);
		
		System.out.println(arr3[n - 1] - arr3[0]);
		br.close();

		//-----------------------
	}

	
	
}

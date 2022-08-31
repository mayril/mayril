

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		StringTokenizer st1=new StringTokenizer(br.readLine());
		
	
		System.out.println();
		//-----------------------
	}
	
	public static class deque {
		private int front;
		private int rear;
		private int size;
		private int[] de;
		
		//생성자 1 초기
		public deque() {
			super();
			this.front = 0;
			this.rear = 0;
			this.size = 0;
			this.de = new int[size];
		}
		
		//생성자 2 용적할당
		public deque(int size) {
			super();
			this.front = 0;
			this.rear = 0;
			this.size = 0;
			this.de = new int[size];
		}
		
	}
	
	
	
	
}

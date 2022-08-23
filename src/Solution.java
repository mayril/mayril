import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Solution{

public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	Scanner sc = new Scanner(System.in);
	//int T=Integer.parseInt(br.readLine());
	int T=sc.nextInt();
	//int T=10;
	for(int test_case = 1; test_case <= T; test_case++){
		int w=sc.nextInt();
		//StringTokenizer st=new StringTokenizer(br.readLine());
		ArrayList<Integer>arrayList=new ArrayList<>();
		//Queue<Integer> queue=new LinkedList<>();
		System.out.print("#"+test_case+" ");
		for (int i = 0; i < w; i++) {
			int k=sc.nextInt();
			if (k==1) {
				int a=sc.nextInt();
				if (arrayList.isEmpty()) {
					arrayList.add(a);
				}else {
					int l=arrayList.size();
					arrayList.add(a);
					boolean flag=true;
					while (flag) {
						if (arrayList.get(l)>arrayList.get(l/2)) {
							int tmp=arrayList.get(l/2);
							arrayList.set(l/2, arrayList.get(l));
							arrayList.set(l, tmp);
						}else {
							flag=false;
						}	
						l/=2;
					}
					

				}
				
			}else {
				if (arrayList.isEmpty()) {
					System.out.print(-1+" ");
				}else {
					System.out.print(arrayList.get(0)+" ");
					arrayList.set(0, arrayList.get(arrayList.size()-1));
					arrayList.remove(arrayList.size()-1);
					boolean flag=true;
					int q=1;
					if (arrayList.size()>0) {
						while (flag) {
							if (q*2<arrayList.size()&&arrayList.get(q-1)<arrayList.get(q*2-1)) {
								int tmp=arrayList.get(q-1);
								arrayList.set(q*2-1, arrayList.get(q-1));
								arrayList.set(q-1, tmp);
							}else if (q*2<arrayList.size()&&arrayList.get(q-1)<arrayList.get(q*2)) {
								int tmp=arrayList.get(q-1);
								arrayList.set(q*2, arrayList.get(q-1));
								arrayList.set(q-1, tmp);
							}else {
								flag=false;
							}
							q++;
						}
					}	
				}
			}
		}//for-end
		System.out.println(arrayList.toString());
		System.out.println();
	}//for_end
}//main_end

}//class_end

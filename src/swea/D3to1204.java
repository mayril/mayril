package swea;

import java.util.Arrays;
import java.util.Scanner;





public class D3to1204
{
public static void main(String args[]) throws Exception
{
/*
 * 10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.
 *  */
	Scanner sc = new Scanner(System.in);

	int T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int height=sc.nextInt();
		int width=sc.nextInt();
		String[][] qus=new String[height][width];
		String qus2="";
		for (int i = 0; i < height; i++) {
			qus2+=sc.next();
		}
		
		String[] qus3=qus2.split("");
		int cnt=0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				qus[i][j]=qus3[cnt++];
			}
		}
		
		int startx=0;
		int starty=0;
		boolean t=true;
		
		for (int i = 0; i < height; i++) {
			if (t) {
				for (int j = width-1; j >0 ; j--) {
					if (qus[i][j].equals("1")) {
						startx=j;
						starty=i;
						//System.out.println(starty+" "+startx);
						t=false;
						break;
					}
				}
			}
		}
		startx=startx-55;
		//System.out.println(startx);

		int endy=0;
		boolean t2=true;
		for (int i = height-1; i >0 ; i--) {
			if (t2) {
				for (int j = width-1; j >0 ; j--) {
					if (qus[i][j].equals("1")) {
						endy=i;
						//System.out.println(endy);
						t2=false;
						break;
					}
				}
			}
		}
		
		int size=endy-starty;
		
		String[][] quse=new String[size+1][56];
		int cnty=0;
		int cntx=0;
		for (int i = starty; i <= starty+size; i++) {
			for (int j = startx; j <= startx+55; j++) {
				quse[cnty][cntx]=qus[i][j];
				cntx++;
			}
			cntx=0;
			cnty++;
		}
		
		/*for (int i = 0; i < size+1; i++) {
			for (int j = 0; j < 56; j++) {
				System.out.print(quse[i][j]);
			}
			System.out.println();
		}
		*/
		String sn="";
		for (int i = 0; i < 56; i++) {
			sn+=quse[0][i];
		}
		
		String[] snarr=new String[8];
		for (int i = 0; i < 8; i++) {
			snarr[i]=sn.substring(i*7, 7*(i+1));
		}
		int[] fin=new int[8];
		for (int i = 0; i < snarr.length; i++) {
			switch (snarr[i]) {
			case "0001101":
				fin[i]=0;
				break;
			case "0011001":
				fin[i]=1;
				break;
			case "0010011":
				fin[i]=2;
				break;
			case "0111101":
				fin[i]=3;
				break;
			case "0100011":
				fin[i]=4;
				break;
			case "0110001":
				fin[i]=5;
				break;
			case "0101111":
				fin[i]=6;
				break;
			case "0111011":
				fin[i]=7;
				break;
			case "0110111":
				fin[i]=8;
				break;
			case "0001011":
				fin[i]=9;
				break;

			}
		}
		int evsum=0;
		int oddsum=0;
		for (int i = 0; i < 7; i++) {
			if ((i+1)%2==0) {
				evsum+=fin[i];
			}else {
				oddsum+=fin[i];
			}
		}
		
		int code=oddsum*3+evsum+fin[7];
		
		int sum2=0;
		for (int i = 0; i < fin.length; i++) {
			sum2+= fin[i];	
		}
		int answer=0;
		
		if (code%10==0) {
			answer=sum2;
		}else {
			answer=0;
		}
		System.out.println("#"+test_case+" "+answer);
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
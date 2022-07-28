package bakjoon;

import java.util.Scanner;


public class Baek4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

		이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
		
		예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
		
		자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 
		 */

		int n=1;	//n 초기값
		
		while (n!=0) {
			n=sc.nextInt();	//n 입력
			int count=0;		//소수의 갯수
			int[] prime = new int[2*n+1];
			if (n==0) {
				break;
			}
				boolean num=true;
				
				for(int i=0; i<=n; i++) {
					prime[i] = 0;
				}
				for(int j=2; j<2*n; j++) {
					for(int k=2; j*k<2*n; k++)
						prime[j*k] = 1;
				}

				if (n!=1) {
					for (int j = n+1; j < 2*n; j++) {
						if (prime[j]!=1) {
							count++;
						}
						
					}
				}else {
					count=1;
				}
				

			System.out.println(count);
			
		}

		
		//-----------------------
	}
	
}

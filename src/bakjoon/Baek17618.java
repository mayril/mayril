package bakjoon;

import java.util.Scanner;


public class Baek17618 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		평소에 수에 대한 관심이 많은 아이인 민철이는 오늘도 노트에 연필로 수를 더하거나 빼거나 곱하거나 나눠보면서 시간을 보내고 있다. 그러다가 18이라는 수는 신기한 성질을 가진다는 것을 알아냈다. 18을 이루는 각 자릿수인 1과 8을 합한 9는 18의 약수가 된다.

		민철이는 18과 같이 모든 자릿수의 합으로 나누어지는 수를 여러 개 더 찾아냈는데, 12, 21도 그런 신기한 수였다. 민철이는 이렇게 모든 자릿수의 합으로 나누어지는 수를 “신기한 수”라고 부르기로 했다. 민철이는 더 큰 신기한 수를 찾아보기도 했는데 1729도 신기한 수라는 걸 알아내었다. 1729는 1+7+2+9=19로 나누어진다.

		민철이는 신기한 수가 얼마나 많은지 알고 싶었다. 주어진 자연수 N에 대해 N이하인 신기한 수는 총 몇 개인지 궁금했다. 하지만 N이하의 모든 수에 대해서 신기한 수인지 아닌지를 손으로 알아내기는 시간이 너무 오래 걸렸다.

		여러분은 민철이를 도울 수 있는 프로그램을 작성해야 한다. 입력으로 1 이상인 자연수 N이 주어질 때 N 이하인 신기한 수의 개수를 출력하는 프로그램을 작성하시오.
		 */
		
		int point=sc.nextInt();// N입력
		int count=0; // 초기값=0
		for (int i = 1; i <= point; i++) { //1부터 N까지
			int yacksoo=0; 				//약수 초기값
			int ori=i;  				// i값을 임시 변수 ori에 넣음
			int len=String.valueOf(i).length();	//i값의 길이 측정
			for (int j = 0; j < len; j++) {		//i자릿수합을 yacksoo에 넣음
				yacksoo+=ori%10;
				ori=ori/10;
			}
			
			if (i%yacksoo==0) {	//i가 yacksoo로 나뉘어지면
				count++;	// count 1 추가
			}
		}
		
		
		
		System.out.println(count);
		
		
		
		//-----------------------
	}
	
}

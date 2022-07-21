package swea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D2to1288
{
public static void main(String args[]) throws Exception
{
/*
민석이는 불면증에 걸렸다. 그래서 잠이 안 올 때의 민간요법 중 하나인 양 세기를 하려고 한다.

민석이는 1번 양부터 순서대로 세는 것이 재미없을 것 같아서 N의 배수 번호인 양을 세기로 하였다.

즉, 첫 번째에는 N번 양을 세고, 두 번째에는 2N번 양, … , k번째에는 kN번 양을 센다.

이렇게 숫자를 세던 민석이에게 잠은 더 오지 않고 다음과 같은 궁금증이 생겼다.

이전에 셌던 번호들의 각 자리수에서 0에서 9까지의 모든 숫자를 보는 것은 최소 몇 번 양을 센 시점일까?

예를 들어 N = 1295이라고 하자.

첫 번째로 N = 1295번 양을 센다. 현재 본 숫자는 1, 2, 5, 9이다.

두 번째로 2N = 2590번 양을 센다. 현재 본 숫자는 0, 2, 5, 9이다.

현재까지 본 숫자는 0, 1, 2, 5, 9이다.

세 번째로 3N = 3885번 양을 센다. 현재 본 숫자는 3, 5, 8이다.

현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.

네 번째로 4N = 5180번 양을 센다. 현재 본 숫자는 0, 1, 5, 8이다.

현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.

다섯 번째로 5N = 6475번 양을 센다. 현재 본 숫자는 4, 5, 6, 7이다.

현재까지 본 숫자는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9이다.

5N번 양을 세면 0에서 9까지 모든 숫자를 보게 되므로 민석이는 양 세기를 멈춘다.


 */
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();

	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int n = sc.nextInt(); //초기값 설정
		int n2= n;//  n의 초기값을 n2에 저장
		Boolean kBoolean =true;//while 반복설정
		int N=0;//N의 값
		int count=0;//값제거 초기값
		String[] arr= {"0","1","2","3","4","5","6","7","8","9"};//1부터 9까지 삽입
		List<String> list =  new ArrayList<String>();
		
		Collections.addAll(list, arr); 			//list에 arr배열 넣음
		
		while (kBoolean) { //kBoolean=참
			String[] su = String.valueOf(n).split("");//n의 모든자릿수를 string으로분할후 배열에 넣음
			for (int i = 0; i < su.length; i++) {	//su의 모든 자릿수
				for (int j = 0; j < list.size(); j++) {//배열 현재 길이
					if (su[i].equals(list.get(j))) {	//list에 값이 남아있가면
						list.remove(su[i]);				//제거
						count=1;// 값이 제거되었다면
					} 
				}
			}

			if (count==1) {//값이 제거되었다면
				N++; 	//제거된 횟수 +1
				count=0;//다시 0으로 돌림
			}
			
			if (list.size()==0) {//list에 모든값이 제거되면
				kBoolean=false; //반복 정지
				System.out.println("#"+test_case+" "+n);
				
			}else {
				
				n+=n2;
			}
		}
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
package swea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class D3to1206
{
public static void main(String args[]) throws Exception
{
/*
강변에 빌딩들이 옆으로 빽빽하게 밀집한 지역이 있다.

이곳에서는 빌딩들이 너무 좌우로 밀집하여, 강에 대한 조망은 모든 세대에서 좋지만 왼쪽 또는 오른쪽 창문을 열었을 때 바로 앞에 옆 건물이 보이는 경우가 허다하였다.

그래서 이 지역에서는 왼쪽과 오른쪽으로 창문을 열었을 때, 양쪽 모두 거리 2 이상의 공간이 확보될 때 조망권이 확보된다고 말한다.

빌딩들에 대한 정보가 주어질 때, 조망권이 확보된 세대의 수를 반환하는 프로그램을 작성하시오.
 
아래와 같이 강변에 8채의 빌딩이 있을 때, 연두색으로 색칠된 여섯 세대에서는 좌우로 2칸 이상의 공백이 존재하므로 조망권이 확보된다. 따라서 답은 6이 된다.

 */
	Scanner sc = new Scanner(System.in);
	int T=10;
	//T=sc.nextInt();
	
	for(int test_case = 1; test_case <= T; test_case++)
	{	
		int build=sc.nextInt(); 
		int[] building=new int[build]; //빌딩의 수
		int zomang[]=new int[4]; //조망권
		int[] zobuild=new int[build];
		int ok=1;// 조망이 가능한지 유무
		int hsum=0;//최대높이

		for (int i =0 ; i < building.length; i++) {
			building[i]=sc.nextInt();// 높이 입력
		}
		
		for (int i = 2; i < building.length-2; i++) { // 시작지점은 2부터 끝지점은 -2까지
			
			for (int j = 1; j <= 2; j++) {//좌우 2채
				zomang[j-1]=building[i]-building[i-j];
				zomang[j+1]=building[i]-building[i+j];
			}
			
			for (int j2 = 0; j2 < zomang.length; j2++) {
				if(zomang[j2]<=0) { //조망이  가려진다면
					ok=0; // ok는 0이다
				}
			}
			
			int mheight=0; //최대높이
			
			if(ok==1) { //조망이 가능하다면
				mheight=zomang[0]; 
				
				for (int k = 0; k < zomang.length; k++) {
					if(zomang[k]<mheight) {
						mheight=zomang[k];//조망값중 최대값 구함
					}
				}
			}

			hsum+=mheight;//최대값의 합을 더함

		}
		
		System.out.println("#"+test_case+" "+hsum);//
		
		
	/////////////////////////////////////////////////////////////////////////////////////////////
	
	}
	}
}
import java.util.Scanner;


public class MovieFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		LoginManager loginManager= LoginManager.getInstance();
		MovieManager movieManager = MovieManager.getInstance();
		int select;
		int select2;
		int select3;
		int loginCheck=0;
		String loginId="";
		String loginPassword="";
		do {
			System.out.println("1.로그인 2. 회원가입");
			select = sc.nextInt();
			if(select == 1) { //추가
				System.out.println("로그인");
				System.out.println("아이디를 입력하세요");
				String id= sc.next();
				System.out.println("비밀번호를 입력하세요");
				String password=sc.next();
				int check=loginManager.login(id, password);
				if (check==1) {
					select=0;
					select2=1;
					loginCheck=1;
				} else {
					System.out.println("다시 로그인하세요");
				}
			}
			else if(select == 2) {
				boolean loginTrue=true;
				System.out.println("회원가입");
				while (loginTrue) {
					sc.nextLine();
					System.out.println("아이디를 입력하세요");
					String id= sc.next();
					System.out.println("비밀번호를 입력하세요");
					String password=sc.next();
					int loginTrue2=loginManager.signUp(id, password);
					if (loginTrue2==1) {
						loginId=id;
						loginPassword=password;
						loginTrue=false;
					}
				}	
			}
			
			if (loginCheck==1) {
				do {
					System.out.println("영화 시스템입니다 번호를 입력해주세요");
					System.out.println("1. 영화 등록\n2. 영화 평점조회 \n3. 영화 목록\n4. 리뷰수정 \n5. 로그인 화면으로 ");
					select3 = sc.nextInt();
					if(select3 == 1) { //추가
						System.out.println("*****영화 등록*****");
						sc.nextLine();
						System.out.println("제목 : ");
						String title = sc.nextLine();
						System.out.println("평점 : ");
						int grade= sc.nextInt();
						System.out.println("리뷰 : ");
						sc.nextLine();
						String review = sc.nextLine();
						System.out.println("감독 : ");
						String director = sc.nextLine();
						Movie movies =new Movie(loginId, loginPassword, title, grade, review, director);
						movieManager.add(movies);;		
					}
					else if(select3 == 2) {
						System.out.print("*****평점조회*****");
						System.out.println("조회할 영화 제목입력");
						sc.nextLine();
						String title = sc.nextLine();
						System.out.println("*****영화 조회: "+title+"*****");
						movieManager.search(title);
						
					}
					else if(select3 == 3) { //모두조회
						System.out.println("*****영화 목록*****");
						movieManager.getList();
					}
					else if(select3 == 4) {
						System.out.println("*****자신의 리뷰 수정*****");
						System.out.println("리뷰 수정할 영화 제목을 입력해주세요");
						sc.nextLine();
						String title = sc.nextLine();
						System.out.println("*****"+title+"의 리뷰 수정*****");
						movieManager.reviewFix(loginId, title);
					}else if (select3== 5) {
						select3 =0;
						loginCheck=0;
						select=1;
					}
				} while(select3 != 0);
			}
			
			
			
		} while(select != 0);
		
		
		
		
	}

}


class  SSAFY {
	String student;
	int age;
	String language;

	public SSAFY() {
	}
	
	public void study() {
		System.out.println("통학버스를 탄다");
	}
	
}

 class Daejeon4 extends SSAFY {
	
	public Daejeon4(){

	}
	public void study() {
		System.out.println("공부를 한다");
	}
	

}

public class Student {
	public static void main(String[] args) {
		SSAFY ssafy = new SSAFY();
		Daejeon4 d4 = new Daejeon4(); // 자식 인스턴스 생성
		ssafy.study();
		d4.study();
	}
}

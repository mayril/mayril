


// 이러한 다양한 자료형 가질수 있는 자료형을 만들고 싶다.
public class Person싱글톤 {
	static int personCount;
	String name;
	int age;
	String hobby;
	
	public Person싱글톤() {
	}
	
	public void info() {
		System.out.println("나의 이름은 "+name + "입니다.");
		System.out.println("나이는 "+age+"세, 취미는 "+hobby+"입니다.");
	}
	
	public void study(int time) {
		//int time = (넘어온값)
		//파라미터는 해당 위치에 선언한 지역변수라고 볼것
		System.out.println(time + "시간 공부했음.");
	}
	//메소드 오버로딩
	//매개변수의 타입이 다르거나 개수가 다르게 정의하여 사용함.
	//리턴타입은 의미가 없음.
	//매개변수 타입이 같고, 이름이 다른것은 오버로딩이라고 하지 않음. 
	//ex) 아래의 time을 hour로 바꾼 새로운 메서드를 추가 작성하면 안됨.
	public void study(long time) {
		System.out.println(time + "시간 공부했음.");
	}
	
	
	//메소드도 static 키워드를 사용할 수 있음.
	//인스턴스를 생성하지 않고 클래스 이름으로 호출 가능함.
	public static void hello() {
		System.out.println("안녕하세용.");
	}
	
	//리턴 타입은 int
	public int getAge() {
		return age;
	}
}

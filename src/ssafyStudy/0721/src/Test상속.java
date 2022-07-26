class Parent{
	int data1 =10;
	int data=10;
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent의 기본 생성자");
	}
	
	protected void print() {
		System.out.println("부모의 print"+this.data);
	}//상속되지않음 override가 아님
}

class Child extends Parent{
	int data2 =20;
	int data=20;
	Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child의 기본생성자");
	}
	public void print() {
		int data=30;
		System.out.println(data); //print()의 data
		System.out.println(this.data);//Child 의 data
		System.out.println(super.data); //Parent 의 data
	}
}
public class Test상속 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Child c=new Child();
		//System.out.println(c.data2);
		//System.out.println(c.data1);
		
		// 자식은 부모 객체에서 호출가능
		//c.print();
		
		//다형성 :부모클래스의 참조변수가 자식클래스의 객체를 참조하는것
		Parent p=new Child();
		System.out.println(p.data);
		p.print();//자식의 print가 생성
		
	}

}

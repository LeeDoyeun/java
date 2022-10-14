package human20221014;

public class ChildSample {

	public static void main(String[] args) {
		System.out.println("p1------------");
		Parent p1 = new Parent();
		p1.field1 = "필드1접근가능";
		p1.method1();
		p1.method2();
		System.out.println("c1------------");
		Child c1 = new Child();
		c1.field1 = "필드1접근가능";
		c1.field2 = "필드2접근가능";
		c1.method1();
		c1.method2();
		c1.method3();
		System.out.println("p2------------");
		Parent p2 = new Child(); //자동타입변환
		//Parent를 상속받은 Child
		p2.field1 = "필드1접근가능";
//		p2.field2 = "필드2접근불가능";
		//오류난다.
		p2.method1();
		p2.method2();
//		p2.method3();
		//오류난다.
		
		System.out.println("c1------------");
		//아래는 불가능한 케이스다. p1은 Child와 무관한 Parent 생성자로 만들어진 인스턴스 객체다
		//int = (int)double
		if(p1 instanceof Child) {
		Child c2 = (Child) p1;
		c2.field1 = "필드1";
		c2.field2 = "필드2";
		c2.method1();
		c2.method2();
		c2.method3();
		} else {
			System.out.println("기능을 수행할 수 없다.");
		}
		
		//불가능한 케이스인지 아닌지 true or false로 출력해 확인해 보겠다.
		System.out.println();
		System.out.println((p1 instanceof Parent));
		System.out.println((p1 instanceof Child));
		System.out.println((c1 instanceof Parent));
		System.out.println((c1 instanceof Child));
		System.out.println((p2 instanceof Parent));
		System.out.println((p2 instanceof Child));
		System.out.println();
		//순서대로 아래와 같이 출력된다.
//		true
//		false
//		true
//		true
//		true
//		true

		
		Child c3 = (Child)p2;
		c3.field1 = "필드1접근";
		c3.field2 = "필드2접근";
		c3.method1();
		c3.method2();
		c3.method3();
		
	}

}

class Parent{
	String field1;
	
	void method1() {
		System.out.println("method1() in Parent");
	}
	void method2() {
		System.out.println("method2() in Parent");
	}
}

class Child extends Parent{
	String field2;
	void method2() {
		System.out.println("method2() in Child");
	}
	void method3() {
		System.out.println("method3() in Child");
	}
}

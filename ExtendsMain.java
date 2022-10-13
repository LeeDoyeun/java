package human20221013;

public class ExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1 = new Parent(600);
		System.out.println(p1.name);
		p1.parentInfo();
		
		Child c1 = new Child();
		System.out.println(c1.grade);
		c1.childInfo();
		
		System.out.println(c1.name);
		System.out.println(c1.money);
		c1.parentInfo();
		
		Child c2 = new Child(5);
		c2.childInfo();
		
		B b = new B();

	}

}

class Parent{//부모클래스
	
	String name = "나부모"; //이름
	int money = 500; //자산
	
	Parent(int money){
		this.money = money;
	}
	void parentInfo() {
		System.out.println(name+"-"+money);
	}
}

class Child extends Parent{//자식클래스
	int grade = 3;
	
	Child(){
		super(1000);
	}
	Child(int grade){
		super(5000);
		this.grade = grade;
	}
	void childInfo() {
		System.out.println(grade);
	}
	void parentInfo() {
		System.out.println("우리 부모님 성함은 "+name+"-"+money);
	}
}

class A{
	   A(){
	      this(30);
	      System.out.println("A()");
	   }
	   A(int a){
	      System.out.println("A("+a+")");
	   }
	}
	class B extends A{
	   B(){
		  this(10);
	      System.out.println("B()");
	      
	   }
	     B(int b){
		      System.out.println("B("+b+")");
	   }
	}
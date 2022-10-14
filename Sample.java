package human20221014;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//상속 is - a
//상속 관계를 만들지 말지

//사람
//한국사람 중국사람 일본사람

//동물
//고양이 사자 인간 선풍기

class Animal {//동물
	String kind; //종류
	int temperature;//체온
	void walk() {//걷는다
		System.out.println("동물이 걷는다.");
	}
	void sleep() {//잔다
		System.out.println("동물이 잔다.");
	}
}

class Cat extends Animal{
	void walk() {//걷는다
		System.out.println("소리없이 걷는다");
	}
	void sleep() {//잔다
		System.out.println("엎드려서 잔다");
	}
}

class Lion extends Animal{
	String kind; //종류
	int temperature;//체온
	void walk() {//걷는다
	}
	void sleep() {//잔다
	}
}

class Person extends Animal{
	String kind; //종류
	int temperature;//체온
	void walk() {//걷는다
	}
	void sleep() {//잔다
	}
}
class Fan {
	String kind;
	int volt;
}
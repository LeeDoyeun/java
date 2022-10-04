package human20221004;
//클래스는 다양한 필드와 메서드와 생성자를 갖고 있다
//필드 : 데이터를 저장하는 변수들
//클래스는 여러 메모리에 있는 변수들을 담고,
//코드적으로 여러개의 객체를 찍어내기 위한 설계도
public class Car {
	//필드 (데이터)
	String company = "현대자동차";
	String name = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	

	
	//메서드 (행위) 
	public String info() {
		String info = "본 자동차의 정보를 출력합니다";
		info += "\n" + name + "\n" + company + "\n" + color;
		// info = info + "\n" + name + "\n" + company + "\n" + color;
		
		return info;
	}

}

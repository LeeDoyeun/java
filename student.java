package human20221007_2;

public class student {
	String name;
	String pw;
	
	//생성자(초기값)을 통해 다양한 값으로 인스턴스를 찍어내자
	//다양하지 않으면 그것 복제!
	//객체간 (메서드 간)에 데이터를 전달하는 방법 중 매개체를
	//저장하는 매개변수 활용
	student(String name, String pw) {
		this.name = name;
		this.pw = pw;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void changeName(String name) {
		if(name.equals(this.name)) {
			System.out.println("같은 이름입니다");
		}else {
			setName(name);
			System.out.println("다른 이름이므로 "+ name +"으로 변경합니다.");
		}
	}

}

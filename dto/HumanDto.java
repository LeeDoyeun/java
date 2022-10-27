package human20221027.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class HumanDto {
	private String name = null;
//	private int age = 0;
	private Integer age = null;
//	private double height = 0;
	private Double height = null;
	private LocalDateTime birthday = null;
	// wrapper class 기본자료형을 클래스로 표현한 클래스
	// null을 사용하거나 관련정보를 추가하기 위해서 사용
	
	public Integer myAge = 0;
	
	
	public Integer getMyAge() {
		return myAge;
	}

	public void setMyAge(Integer myAge) {
		if(myAge < 0) {
			System.out.println("myAge에 음수를 넣을 수 없습니다. 0으로 세팅됩니다.");
			myAge = 0;
		}
		this.myAge = myAge;
		
	}

	public void myPrint() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("생일 : " + birthday.format(
				DateTimeFormatter.ofPattern("yyyy-MM-dd")));
	}

	// toString
	@Override
	public String toString() {
		return "HumanDto [name=" + name + ", age=" + age + ", height=" + height + ", birthday=" + birthday + "]";
	}

	// 객체비교 equals
	@Override
	public int hashCode() {
		return Objects.hash(age, birthday, height, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HumanDto other = (HumanDto) obj;
		return Objects.equals(age, other.age) && Objects.equals(birthday, other.birthday)
				&& Objects.equals(height, other.height) && Objects.equals(name, other.name);
	}

	// 생성자
	public HumanDto() {
	}	
	// HumanDto dto = new HumanDto();
	// 생성자에 변화를 주면 기본생성자가 없으면 동작하지 않는다.
	public HumanDto(String name, Integer age, Double height, LocalDateTime birthday) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public LocalDateTime getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDateTime birthday) {
		this.birthday = birthday;
	}

}

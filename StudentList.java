package human20221004;

import java.util.ArrayList;

public class StudentList {
	//private 선언된 필드, 메서드는 class 외부에서 사용 못함.
	ArrayList<String> studentList = new ArrayList<>();
	ArrayList<String> studentList_string = new ArrayList<>();
	
	//생성자 : 인스턴스 만들 때 초기 스타일(커스텀)
	//inputList라는 가변배열을 필드에 바로 할당
	StudentList(ArrayList<String> studentList_string){
		//인스턴스를 만들 때 매개변수 배열을
		//필드값 studentList_string에 할당
		//this 가장 가까운 객체(클래스)
		//this = class StudentList
		//class StudentList에 가장 가까운 studentList_string 변수
		//= 전역변수(필드)인 studentList_string
		this.studentList_string = studentList_string;	
	}
	
	//메서드 : 행위
	//메서드를 실행할 때마다 학생의 이름은 studentList 배열에 추가
	public void addStudent(String studentName) {
		studentList.add(studentName);
	}
	
	public ArrayList<String> getStudentList(){
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		return null;
	}
	//default 값으로 public
	void getTest() {
		System.out.println(studentList.get(0));
	}

}

package human202221019;

public class prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu01 = new Student();
		stu01.setMajor("컴공");
		stu01.setStudentId(1);
		
		System.out.println("학과 : " + stu01.getMajor());
		System.out.println("학번 : " + stu01.getStudentId());
		
		System.out.println(stu01.toString());
		
		Student stu02 = new Student("경제", 31);
		System.out.println(stu02.toString());
		stu02.setMajor("심리");
		System.out.println(stu02.toString());

	}
	//학생성적기록부 : "1번학생" - 수학성적, 영어성적
	
	//수학성적목록 : "1번학생 점수"
	//영어성적목록 : "1번학생 점수"
	//국어성적목록 : "1번학생 점수"



}
//Student 클래스 -> 객체(인스턴스) -> 필드 변수를 활용
class Student{
	private String major;//학과
	private int studentId;//학번
//	String name;
	Student(){
	}
	Student(String major, int studentId){
		this.major = major;
		this.studentId = studentId;
	}
	public String toString() {
		return "학과 : " + major + " / 학번 : " + studentId;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
}

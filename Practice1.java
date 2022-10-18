package human20221018;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("한문학과", 20221018);
		System.out.println("전공은 " + student1.getMajor());
		System.out.println("학번은 " + student1.getNumber());
		Scanner scan = new Scanner(System.in);
		System.out.println("변경된 학과를 입력하십시오.");
		String temp1 = scan.nextLine();
		student1.setMajor(temp1);
		System.out.println("변경된 학번을 입력하십시오.");
		int temp2 = scan.nextInt();
		scan.nextLine();
		student1.setNumber(temp2);
		System.out.println("전공은 " + student1.getMajor());
		System.out.println("학번은 " + student1.getNumber());
	}
}

class Student extends Practice1 {
	private String major;
	private int number;

	Student(String major, int number) {
		this.major = major;
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
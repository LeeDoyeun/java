package human20221004;

//인스턴스 이해하기
//1-1. 여러 그룹을 만드는 class를 작성하시고,
//그룹 별 조원 중에 랜덤으로 뽑는 인스턴스를 만드시오
//(요구사항 파악, 필요한 필드 선정 능력, 인스턴스 이해)

//1)여러그룹 : 여러개를 만든다(인스턴스) + 그룹이라는 객체(=class)
//2) class를 만들기 :
// class : (필드 : 데이터) + (생성자X) + (메서드 : 행위)
// 필요한 데이터 : 그룹이름, 학생들 이름
// 필요한 메서드 : 랜덤으로 뽑는 행위
public class group {
	//필드 : 데이터
	String groupName = "";
	static String[] studentList = {"정윤호", "허영주","김지희"};
	
	//메서드 : 행위 : 랜덤으로 학생이름 뽑기
	public static String randomStudentName() {
		String randomStudentName = "";
			int tempNum = (int)(Math.random()*studentList.length);
			randomStudentName = studentList[tempNum];
			return randomStudentName;
	}
	//제네릭 : 정적타입의 최대 단점인 타입 자유도를 위해
	//만들어진 개념, 타입을 런타임 이후 시점에서 지정하는 것
	
	//public : 접근제한자
	//<T> : 제네릭타입
	//T : 반환타입
	//(T inputData) : 매개변수 타입과 매개변수명
	public<T> T genericMethod(T inputData) {
		return inputData;
	}
	public String normalMethod(String inputData) {
		return inputData;
	}
	public String info() {
		return  studentList[0] + studentList[1] +studentList[2];
	}

}

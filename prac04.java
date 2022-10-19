package human202221019;

public class prac04 {

	public static void main(String[] args) {
		Computer pc = new Computer(0, 16); 
		Computer apple = new Computer(1, 32); 
		Computer galaxy = new Computer(2, 16); 
		
		Computer[] coms = {pc, apple, galaxy};
		for(Computer c : coms) {
			c.print();
		}
		pc.print(); 
		apple.print(); 
		galaxy.print(); 

	}

}

class Computer {
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	//필드
	//설치된 osType 뭔지
	int osTypeIndex;//0,1,2
	String osTypeName;//osType배열에 있는 운영체제 이름
	//메인메모리
	int memory;
	Computer(int osTypeIndex, int memory){
		this.osTypeIndex = osTypeIndex;
		this.memory = memory;
		this.osTypeName = osType[osTypeIndex];
	}
	
	public void print() {
		System.out.println("운영체제: "+ osTypeName + " 메인메모리: "+memory);
		//아래와 같은 방법도 있다.
//		System.out.println("운영체제: "+ osType[osTypeIndex] + " 메인메모리: "+memory);
	}
}

package human202221019;

public class prac04_2 {

	public static void main(String[] args) {
		Computer2 pc = new Computer2(0, 16); 
		Computer2 apple = new Computer2(1, 32); 
		Computer2 galaxy = new Computer2(2, 16); 
		
		Computer2[] coms = {pc, apple, galaxy};
		for(Computer2 c : coms) {
			c.print();
		}
		pc.print(); 
		apple.print(); 
		galaxy.print(); 
		
		Printable[] paArr = {pc, apple, galaxy};
		for(Printable pa : paArr) {
			pa.print();
		}

	}

}
interface Printable { //출력할 수 있는지
	public void print(); // 출력한다 의미를 가진 print()메서드는 꼭 구현되어야 한다.는 의미
}
class Computer2 implements Printable{
	public static final String[] osType = {"윈도7", "애플 OS X", "안드로이드"};
	//필드
	//설치된 osType 뭔지
	int osTypeIndex;//0,1,2
	String osTypeName;//osType배열에 있는 운영체제 이름
	//메인메모리
	int memory;
	Computer2(int osTypeIndex, int memory){
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

package human20221018;

public class Practice4 {
	public static void main(String[] args) {
		Computer pc = new pc(0, 16); 
		Computer apple = new apple(1, 32); 
		Computer galaxy = new galaxy(2, 16); 
		Computer[] computers = {pc, apple, galaxy};
//		pc.print(); 
//		apple.print(); 
//		galaxy.print(); 
		for(Computer c : computers) {
			c.print();
		}
		
	}
}
interface Computer{
	String[] osType = {"원도7", "애플 OS X", "안드로이드"};

	void print();
}
class pc implements Computer{
	int num;
	int mainMemory;
	pc(int num, int mainMemory){
		this.num = num;
		this.mainMemory = mainMemory;
	}
	@Override
	public void print() {
		System.out.println("운영체제: "+ osType[num] +", 메인메모리:" + mainMemory);
	}
	
}
class apple implements Computer{
	int num;
	int mainMemory;
	apple(int num, int mainMemory){
		this.num = num;
		this.mainMemory = mainMemory;
	}
	@Override
	public void print() {
		System.out.println("운영체제: "+ osType[num] +", 메인메모리:" + mainMemory);
	}
	
}
class galaxy implements Computer{
	int num;
	int mainMemory;
	galaxy(int num, int mainMemory){
		this.num = num;
		this.mainMemory = mainMemory;
	}
	@Override
	public void print() {
		System.out.println("운영체제: "+ osType[num] +", 메인메모리:" + mainMemory);
	}
	
}
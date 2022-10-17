package human20221017;

public class InterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.methodA();
		a.methodB();
		
		InterA ia = a;
		InterB ib = a;

	}

}
class ClassA implements InterA{
	public void methodA() {
		System.out.println("methodA in classA");
		
	}
	public void methodB() {
		System.out.println("methodB in classB");
		
	}
}
interface InterA extends InterB{
	void methodA();
}
interface InterB{
	void methodB();
}
interface InterC{
	void methodC();
}
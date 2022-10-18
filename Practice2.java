package human20221018;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new SalaryMan().getAnnualGross()); 
		System.out.println(new SalaryMan(2_000_000).getAnnualGross()); 

	}

}
class SalaryMan{
	int salary = 1000000;
	SalaryMan(){
	}
	SalaryMan(int salary){
		this.salary = salary;
	}
	
	public int getAnnualGross(){
		return salary*12+salary*5;
	}
}
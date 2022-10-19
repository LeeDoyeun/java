package human202221019;

import java.util.ArrayList;
import java.util.List;

public class prac02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan sm01 = new SalaryMan();
		
		System.out.println(new SalaryMan().getAnnualGross()); 
		System.out.println(new SalaryMan(2000000).getAnnualGross());

		SalaryMan[] smarr = {sm01, new SalaryMan(), new SalaryMan(2000000)};
		System.out.println(smarr[2].getAnnualGross());
		
		List<SalaryMan> smList = new ArrayList<SalaryMan>();
		smList.add(sm01);
		smList.add(new SalaryMan());
		
		System.out.println(smList.get(1).getAnnualGross());
	}

}

class SalaryMan {
	//필드
	int salary = 1000000;//월 급여액
	
	public SalaryMan() {
		//매개변수 없는 기본생성자
	}
	
	public SalaryMan(int salary) {//시작 월급여액을 받는 생성자
		this.salary = salary;
	}
	
	//메서드
	public int getAnnualGross(){//연봉을 반환하는 메서드
		//연봉반환
		//월급의 500%가 보너스
		//((1년 12달 = 월급) * 12 =) 연봉 +  보너스(= 월급*5) = 진짜 연봉
		int result = (salary*12)+(salary*5);
		return result;
	}
}

package human20221011;

public class TV {
	String company;
	int year = 0;
	int inch = 0;
	
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}	


	public void show() {
		System.out.println(company+"제품 "+ year +"년형 " + inch+"인치 TV");
		
	}
}


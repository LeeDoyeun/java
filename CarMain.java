package human20221017;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();

		for(int i=1; i<=5; i++) {  //i : 1 ~ 5 다섯번
			
			int problemLocation = car.run(); //car 달려라. return 활용
								  //return 0 1 2 3 4
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
				break;
			case 3:
				System.out.println("뒤왼쪽 NexenTire로 교체");
				car.backLeftTire = new NexenTire("뒤왼쪽", 14);	
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);		
				break;
			}
			System.out.println("----------------------------------------");
			
		}
		
		
		
	}
}




class Car {
	//필드
	Tire frontLeftTire = new HankookTire("앞왼쪽", 6);
//	HankookTire frontLeftHankookTire = new Tire("앞왼쪽", 6);
//	KumhoTire frontLeftKumhoTire = new Tire("앞왼쪽", 6);
//	NexenTire frontLeftNexenTire = 
	Tire frontRightTire = new HankookTire("앞오른쪽", 2);
	Tire backLeftTire = new HankookTire("뒤왼쪽", 3);
	Tire backRightTire = new HankookTire("뒤오른쪽", 4);

	//생성자
	//메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop(); 
			return 1; 
		};
		if(frontRightTire.roll()==false) { 
			stop(); 
			return 2; 
		};
		if(backLeftTire.roll()==false) { 
			stop(); 
			return 3; 
		};
		if(backRightTire.roll()==false) { 
			stop(); 
			return 4; 
		};
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
interface Tire {
	public boolean roll(); 
}
class HankookTire implements Tire{
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	public HankookTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.accumulatedRotation = 0;
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
class KumhoTire implements Tire {
	//필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	//생성자
	public KumhoTire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		this.accumulatedRotation = 0;
	}	
	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}
	}
}
class NexenTire implements Tire{
	//필드
		public int maxRotation;
		public int accumulatedRotation;
		public String location;
		//생성자
		public NexenTire(String location, int maxRotation) {
			this.location = location;
			this.maxRotation = maxRotation;
			this.accumulatedRotation = 0;
		}

	//메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + " NexenTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " NexenTire 펑크 ***");
			return false;
		}
	}
}



























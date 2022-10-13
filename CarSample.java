package human20221013;

public class CarSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		Vehicle vehicle1 = bus;
		Vehicle vehicle2 = taxi;
		
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(vehicle1);
		driver.drive(vehicle2);

	}

}
class Driver{

	void drive(Vehicle vehicle) {
//		System.out.println("drive vehicle");
		vehicle.run();
	}
//	void drive(Bus bus) {
//		System.out.println("drive bus");
//		bus.run();
//	}
//	void drive(Taxi taxi) {
//		System.out.println("drive taxi");
//		taxi.run();
//	}
}
class Vehicle{
	void run() {
		System.out.println("탈것이 달립니다.");
	}
}
class Bus extends Vehicle{
	void run() {
		System.out.println("버스가 달립니다.");
	}
}
class Taxi extends Vehicle{
	void run() {
		System.out.println("택시가 달립니다.");
	}
}
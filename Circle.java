package human20221011;

public class Circle {
	static int radius = 0;
	Circle(){
		
	}
	public static void setRadius(int r) {
		radius = r;
	}
	
	public static double getArea() {
		double Area = Math.pow(radius, 2)*Math.PI;
		return Area;
	}

}

package human20221011;

public class Rectangle {
	static double width = 0;
	static double height = 0;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public static double getArea() {
		double area = width*height;
		return area;
	}

}

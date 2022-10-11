package human20221011;

public class Triangle {
	static double width = 0;
	static double height = 0;
	
	Triangle(){
	}
	
	public static void setSize(double w, double h) {
		width = w;
		height = h; 
	}
	
	public static double getArea() {
		double area = (width*height)/2;
		return area;
	}


}

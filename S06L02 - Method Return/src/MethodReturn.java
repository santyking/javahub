
public class MethodReturn {

	public static void main(String[] args) {
		System.out.println("The area is "
				+ ":"+area(10,12));
	}
	
	public static double area(double length,double breadth) {
		double area = length*breadth;
		return area;
	}

}

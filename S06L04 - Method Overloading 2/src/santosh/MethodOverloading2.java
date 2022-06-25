package santosh;

public class MethodOverloading2 {

	public static void main(String[] args) {
		// to add numbers
		System.out.println("The sum of 2 entities is : "+sum(1,2));
		System.out.println("The sum of 2 entities is : "+sum(1,2.5f));
		System.out.println("The sum of 2 entities is : "+sum(1.5d,2.5d));
	}
//	Both are int
	public static int sum(int x,int y) {
		System.out.println("Adding 2 numbers...");
		return(x+y);
	}
//	1 is int and other is float
	public static float sum(int x,float y) {
		System.out.println("Adding 2 numbers...");
		return(x+y);
	}
//	both are double
	public static double sum(double x,double y) {
		System.out.println("Adding 2 numbers...");
		return(x+y);
	}
}

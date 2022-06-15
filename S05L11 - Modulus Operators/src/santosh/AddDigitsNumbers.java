package santosh;

public class AddDigitsNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNumber = 512;
		int quotient = 0;
		int remainder = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			quotient = targetNumber/10;
			remainder = targetNumber%10;
			targetNumber = quotient;
			sum = sum + remainder;
		}
		System.out.println("sum is : "+sum);
	}

}

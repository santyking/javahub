package santosh;

public class MethodExercise {

	public static void main(String[] args) {
		isPrime(7);
	}
	public static void isPrime(int number) {
		if (number==0||number==1) {
			System.out.println("Number is not prime");
		}
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				System.out.println("Number is not prime");
				break;
			}
			else {
				System.out.println("Number is prime");
				break;
			}
		}
	}

}

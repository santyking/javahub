package santosh;

public class DisplayPrime {

	public static void main(String[] args) {
		CalculatePrime prime = new CalculatePrime();
		if (prime.isPrime(7.2d)) {
			System.out.println("the given number is prime");
		}
		else {
			System.out.println("The given number is not prime");
		}
	}

}

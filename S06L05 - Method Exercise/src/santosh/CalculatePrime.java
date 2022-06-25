package santosh;

public class CalculatePrime {
//	for int inputs
	public boolean isPrime(int number) {
		boolean isPrime = true;
		if (number==0||number==1) {
			isPrime=false;
		}
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
//	for double inputs
	public boolean isPrime(double doubleNo) {
		boolean isPrime = true;
		//cast to remove after decimals
		int number = (int) doubleNo;
		if (number==0||number==1) {
			isPrime=false;
		}
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	
}

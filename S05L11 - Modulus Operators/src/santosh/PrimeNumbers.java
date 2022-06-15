package santosh;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int getNumber = 19;
		int count = 0;
		if (getNumber==0||getNumber==1) {
			System.out.println("Number is not Prime");
		}
		for (int i = 2; i < getNumber; i++) {
			if (getNumber%i==0) {
				count++;
				break;
			} 		
		}
		if (count==0) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not prime");
		}
	}

}

package santosh;

public class ForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 9,temp = 0;
		for (int i = 2; i < number-1; i++) {
			if (number%i==0) {
				temp = temp +1;
			}
		}
		if (temp>0) {
			System.out.println("Not a Prime number");
		} else {
			System.out.println("Prime Number");
		}
	}

}

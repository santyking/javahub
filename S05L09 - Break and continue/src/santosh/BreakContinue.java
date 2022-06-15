package santosh;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		using break, it breaks the complete loop
		/*
		for (int i = 1; i <= 5; i++) {
			if (i==3) {
				break;
			}
			System.out.println(i);
		}
		*/
//		using continue, it skips the iteration and completes the loop
		for (int i = 0; i <= 5; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}

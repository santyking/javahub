package santosh;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Basic nested loop
		
		/*
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.println("The value of i is : "+i+"The value of j is : "+j);
			}
		}
		*/
		
//		Star pattern
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}

}

package santosh;

public class LoopsRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		using for loop
		/*
		for (int i = 1,j=1; i < 10 && j < 10; i++,j++) {
			System.out.println("The Value of i is "+i+" and value of j is"+j);
			j++;
		}
		*/
		
//		using while loop
		/*
		int i=1,j=1;
		while (i<=10 && j<=10) {
			System.out.println("The Value of i is "+i+" and value of j is"+j);
			i++;j++;
		}
		*/
		
//		using do while loop
		int i=1,j=1;
		do {
			System.out.println("The Value of i is "+i+" and value of j is"+j);
			i++;j++;
		} while (i<=10 && j<=10);
	}

}

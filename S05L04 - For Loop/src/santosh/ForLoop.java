package santosh;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		type 1
		/*
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
			
		}
		*/
//		Type 2
		/*
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		*/
//		Type 3 
//		Here we have used Declaration earlier
		/*
		int i = 1;
		for (; i <= 5; i++) {
			System.out.println(i);
		}
		*/
//		Type 4
//		Here we declare earlier and conditionalize later
		/*
		int i = 1;
		for (;; i++) {
			if (i>5) {
				break;
			}
			System.out.println(i);
		}
		*/
//		Type 5
//		Here we do even the incrementation later
		
		int i = 1;
		for (;;) {
			if (i>5) {
				break;
			}
			System.out.println(i);
			i++;
		}
		
	}

}

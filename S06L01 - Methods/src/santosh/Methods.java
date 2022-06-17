package santosh;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// old method
		/*
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*************************************");
		int j = 11;
		while(j<=20) {
			System.out.println(j);
			j++;
		}
		*/
//		using void return type
		/* 
		printer1();
		System.out.println("*************************************");
		printer2();
		*/
//		using int parameters type
		printer(1,10);
		System.out.println("*************************************");
		printer(11,20);
	}
	
	/*
	public static void printer1(){
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void printer2() {
		int j = 11;
		while (j<=20) {
			System.out.println(j);
			j++;
		}
	}
	*/
	
	public static void printer(int start,int end) {
		while (start <= end) {
			System.out.println(start);
			start++;
		}
	}
}

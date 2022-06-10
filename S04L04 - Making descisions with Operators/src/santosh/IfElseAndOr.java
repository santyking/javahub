package santosh;

public class IfElseAndOr
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		boolean var1 = false;
		boolean var2 = false;
//		and operation
		if (var1 && var2) {
			System.out.println("Both are true");
		} else {
			System.out.println("One of them is false");
		}
//		Or Operation
		if (var1 || var2) {
			System.out.println("Any of them is true");
		} 
		
		else {
			System.out.println("Both of them are false");
		}
		
//		example 2 in which we will have sub blocks to test and or Operations
		int x = 10;
		int y = 20;
		if ((x < y)&&(x==10)) {
			System.out.println("Both Conditions are true");
		} else {
			System.out.println("One of them is false");
		}
//		Not Operators
		if (!((x < y)&&(x==10))) {
			System.out.println("Both Conditions are true");
		} else {
			System.out.println("One of them is false");
		}
	}

}

package santosh;

public class Strings
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String name = "Santosh \u00BB";
		System.out.println(name);
		String num1 = "10";
		String num2 = "20";
		System.out.println(num1+num2);
//		here we get 1020 because both are strings, Hence it is getting concatenated.
		int n1 = 10;
		String n2 = "20";
		System.out.println(n1+n2);
//		Here we still get 1020 because when one of the operand is sting it is getting converted
		System.out.println(n1+20+"Hi");
//		Another method of declaring a string is
		String m1 = new String("Hey Santosh");
		System.out.println(m1);
	}

}

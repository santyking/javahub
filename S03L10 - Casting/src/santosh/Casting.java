package santosh;

public class Casting
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a = 10;
//		Narrowing is storing big data to small
		short b = (byte)a;
		System.out.println(b);
		
		double v2 = 20.123456789d;
		float v1 = (float)v2;
		System.out.println(v1);
	}

}

package santosh;

import java.math.BigDecimal;

public class BigDecimals
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double number1 = 1.05;
		double number2 = 2.55;
		System.out.println(number1+number2);
//		here we are getting op as 3.5999999999999996 and not 3.60. to avoid this kind of issues 
//		we use bigdecimals class, this will give higher precision and help to calculate accurately.
		BigDecimal big1 = new BigDecimal(1.05);
		BigDecimal big2 = new BigDecimal(2.55);
		System.out.println(big1.add(big2));
//		still the issue persisted, we are getting output as 599999999999999866773237044981215
//		to avoid this we will use "" for numbers to avoid rounding off to get exact output.
		BigDecimal big3 = new BigDecimal("1.05");
		BigDecimal big4 = new BigDecimal("2.55");
		System.out.println(big3.add(big4));
	}

}

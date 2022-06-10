package santosh;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 28;
		if (age<18) {
			System.out.println("You are just a kid");
		} 
		else if(age>=18 && age <=28) {
			System.out.println("You are in growth stage");
		}  
		else if(age>28 && age<=60){
			System.out.println("You have responsiblities");
		}
		else if(age>60 && age<=130) {
			System.out.println("You are senior citizen");
		}
		else {
			System.out.println("You are a robot");
		}
	}

}

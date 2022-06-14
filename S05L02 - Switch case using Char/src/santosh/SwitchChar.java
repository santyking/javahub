package santosh;

public class SwitchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = 'm';
		switch (gender) {
		case 'M': 
		case 'm': 
			System.out.println("Male");
			break;
			
		case 'F':
		case 'f':
			System.out.println("Female");
			break;
		
		default:
			System.out.println("None");
			break;
		}
	}

}

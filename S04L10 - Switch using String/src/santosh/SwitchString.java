package santosh;

public class SwitchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender = "Male";
		
		switch (gender.toLowerCase()) {
		case "male": 
			System.out.println("Male");
			break;
		case "female":	
			System.out.println("Female");
			break;
		default:
			System.out.println("None");	
			break;
		}
	}

}

package customexception;

public class ValidateAge {
	
	public static void validateAge(int age) throws InvalidAge_Exception {
		if (age<18) {
			throw new InvalidAge_Exception("Invalid Age");
		}else {
			System.out.println("You can vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(13);
		}
		catch(InvalidAge_Exception c) {
			System.out.println("Exception caught");
			System.out.println("Exception occured is "+c);
		}

	}
}

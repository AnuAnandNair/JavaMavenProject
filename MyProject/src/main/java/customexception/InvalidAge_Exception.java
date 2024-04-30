package customexception;

public class InvalidAge_Exception extends Exception {
	
	public InvalidAge_Exception(String errorMessage) {//constructor
		super(errorMessage);// calling the constructor of parent Exception  
	}

}

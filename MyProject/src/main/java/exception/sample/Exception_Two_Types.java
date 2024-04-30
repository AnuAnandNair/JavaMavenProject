package exception.sample;

public class Exception_Two_Types {	

	public static void main(String[] args) {
		try {
			int a[]= new int[5];
			a[5]=30/0;//Arithmetic Exception will be thrown and not ArrayIndexOutOfBoundsException
			//Since the exception occurs during expression evaluation the assignment into array[2] never occurs, 
			//because assignment can't happen until the expression on the right-hand-side has been executed into a value that can be assigned.
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception "+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayOutOfBoundsException "+e);
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
		}	
	}
}

package exception.sample;

public class Exception_Two_Types1 {	
	
	public void ArrayArithmetic() {
		//to handle Arithmetic Exception
		try {
			int a[]= new int[5];
			a[4]=30/0;
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
		
		
		try {//to handle ArrayIndexOutOfBoundsException
			int a[]= new int[5];
			a[5]=0;
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

	public static void main(String[] args) {
		Exception_Two_Types1 t1=new Exception_Two_Types1();
		t1.ArrayArithmetic();
	}
}

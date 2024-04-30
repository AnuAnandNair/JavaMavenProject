package exception.sample;

public class ExceptionSample {
	int a=10;
	
	public void divide() {
		try{
			int q=a/0;		
			System.out.println(q);
		}
		catch(ArithmeticException e1) {
			System.out.println("Exception is handled" +e1);//e1 displays the name of the exception thrown.
		}
		finally {
			System.out.println("In finally block");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionSample e1=new ExceptionSample();
		e1.divide();
	}

}

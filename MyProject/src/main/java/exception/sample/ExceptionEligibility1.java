package exception.sample;

public class ExceptionEligibility1 {
	int a=10;
	
	public void eligibility() throws Exception {
		if(a>=18) {
			System.out.println("You are eligible to vote");
		}else {
			//System.out.println("You are not eligible to vote");
			throw new Exception("Not eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Eligibility ex=new Exception_Eligibility();
		ex.eligibility();

	}

}

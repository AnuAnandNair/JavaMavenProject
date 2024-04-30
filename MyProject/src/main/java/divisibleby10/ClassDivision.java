package divisibleby10;

public class ClassDivision extends ClassSum {
	
	public void sum1() {		
		int sum=super.sum();		
		System.out.println("The sum returned is ");
		
		if(sum%10==0) {
			System.out.println("The number is divisible by 10");
		}
		else {
			System.out.println("The number is not divisible by 10");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDivision c1=new ClassDivision();
		c1.sum1();
	}
}

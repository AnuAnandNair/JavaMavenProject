package divisibleby10;

public class DivideParamConstructor extends SumParamConstructor{
	
	public DivideParamConstructor(){//constructor
		super(10,50);
	}
	public void divisibility() {
		int sum=super.sum();
		System.out.println("The sum returned from parent is :"+sum);
		if(sum%10==0) {
			System.out.println("The number is divisible by 10");
		}
		else {
			System.out.println("The number is not divisible by 10");
		}		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideParamConstructor cd1=new DivideParamConstructor();
		cd1.divisibility();
	}
}

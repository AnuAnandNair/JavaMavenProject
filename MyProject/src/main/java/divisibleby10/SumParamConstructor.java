package divisibleby10;

public class SumParamConstructor {
	int num1;
	int num2;
	//int sum;
	
	public SumParamConstructor(int a, int b) {
		this.num1=a;
		this.num2=b;		
	}
			
	public int sum() {
		/*this.sum=this.num1+this.num2;	
		System.out.println("The sum is :"+sum);
		return this.sum;*/
		int sum=this.num1+this.num2;	
		System.out.println("The sum is :"+sum);
		return sum;
	}	
}

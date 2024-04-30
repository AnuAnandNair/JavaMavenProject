package divisibleby10;

public class ClassSumParam {
	int num1;
	int num2;
			
	public int sum(int a, int b) {
		this.num1=a;
		this.num2=b;
		int sum=num1+num2;
		System.out.println("The sum is :"+sum);
		return sum;
	}
}

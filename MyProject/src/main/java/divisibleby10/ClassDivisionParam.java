package divisibleby10;

public class ClassDivisionParam extends ClassSumParam {
	
	public void divisibility() {
		int sum=super.sum(10,20);
		
		if(sum%10==0) {
			System.out.println("The number is divisible by 10");
		}
		else {
			System.out.println("The number is not divisible by 10");
		}		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDivisionParam cd1=new ClassDivisionParam();
		cd1.divisibility();
	}
}

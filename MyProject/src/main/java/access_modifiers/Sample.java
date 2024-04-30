package access_modifiers;

public class Sample {
	int sum,sum1,sum2,sum3;
	
	public void add() {
		//sum=a+b;
		//System.out.println("The sum is "+sum);
		System.out.println("public");
	}
	
	private void add1() {
		//sum1=a+b;
		//System.out.println("The sum is "+sum1);
		System.out.println("private");
	}
	
	protected void add2() {
		//sum2=a+b;
		//System.out.println("The sum is "+sum2);
		System.out.println("protected");
	}

	void add3() {
		//sum3=a+b;
		//System.out.println("The sum is "+sum3);
		System.out.println("default");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		s1.add();
		s1.add1();	
		s1.add2();
		s1.add3();
		
		//System.out.println("The sum is "+s1.sum);
	}

}

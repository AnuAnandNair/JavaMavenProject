package polymorphismpack;

public class ChildClass1 extends ParentClass1 {
	
	public void add() {
		super.add();
		a=20;
		b=70;
		sum=a+b;
		System.out.println("The sum is "+sum);
	}

	public static void main(String[] args) {
		ChildClass1 c1=new ChildClass1();
		c1.add();
	}
}

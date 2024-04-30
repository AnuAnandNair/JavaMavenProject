package polymorphismpack;

public class ChildClass extends ParentClass {

	public void display() {//overrides ParentClass display		
		super.display();
		System.out.println("In child class");		
	}
	
	public static void main(String[] args) {		
		ChildClass c1=new ChildClass();
		c1.display();	
		//super.display();//can't use super in a static context
	}
}


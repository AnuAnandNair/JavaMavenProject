package hybridinheritance;

public class Son extends Father {
	
	public void display3() {
		System.out.println("In Son Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s=new Son();
		s.display3();
		s.display1();
		s.display();
		
		Daughter d=new Daughter();//Daughter object can be created here or create daughter object in Daughter Class
		d.display2();
		d.display1();
		d.display();
		
	}

}

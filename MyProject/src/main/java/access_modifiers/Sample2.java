package access_modifiers;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s1=new Sample();
		s1.add();
		//s1.add1();	//private method cannot be accessed from another class within same package
		s1.add2();
		s1.add3();
	}

}

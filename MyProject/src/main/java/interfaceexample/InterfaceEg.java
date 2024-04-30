package interfaceexample;

public class InterfaceEg implements Interface_Eg1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method of interface");	
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	
	public static void main(String[] args) {
		InterfaceEg i1=new InterfaceEg();
		i1.display();
		System.out.println();
		//inteface object with the help of class
		//interfacename objectname=new Classname();
		Interface_Eg1 e1=new InterfaceEg();
		System.out.println("Printing using inteface obj");
		e1.display();
	}

	
}

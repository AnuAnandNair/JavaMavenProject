package encapsulation;

public class Encapsulation1 {
	private int a,b;
	
	public void setter(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void getter() {
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
}

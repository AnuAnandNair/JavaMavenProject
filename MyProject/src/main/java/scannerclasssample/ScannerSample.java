package scannerclasssample;
import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String s1=sc1.nextLine();
		
		System.out.print("Enter a number: ");
		int i1=sc1.nextInt();
		
		System.out.print("Enter a character: ");
		char c1=sc1.next().charAt(0);
		
		System.out.print("Enter float number: ");
		float t=sc1.nextFloat();//Don't use f while entering value that is don't use 34.98f, enter as 34.98
		
		System.out.print("Enter double number: ");
		double d1=sc1.nextDouble();//Don't enter value with d that is enter value as 67.8906
		  
		System.out.print("Enter short number: ");
		short a=sc1.nextShort();
		
		System.out.print("Enter long number: ");
		long l1=sc1.nextLong();		
		
		System.out.print("Enter boolean: ");
		boolean b=sc1.nextBoolean();//true or false		
		
		System.out.println();		
		System.out.println("Name: "+s1);
		System.out.println("Number: "+i1);
		System.out.println("Character: "+c1);
		System.out.println("Float: "+t);
		System.out.println("Double: "+d1);		
		System.out.println("Short: "+a);
		System.out.println("Long: "+l1);
		System.out.println("Boolean: "+b);			
	}
}

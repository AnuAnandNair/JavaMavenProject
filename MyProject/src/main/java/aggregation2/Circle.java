package aggregation2;

public class Circle {
	
	double pi=3.14;
	
	Square sq;//aggregation
	
	public double area(int radius) {
		
		Square sq=new Square();		
		int sq_area=sq.squarearea(radius);	
		double area=pi*sq_area;
		return area;
	}
	
	public static void main(String[] args) {
		
		//Square sq=new Square();
		Circle c=new Circle();
		double a=c.area(5);
		System.out.println("The area is "+a);
}

}

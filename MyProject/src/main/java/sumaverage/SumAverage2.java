//To find average using default instance method, values should be passed at the time of object creation.

package sumaverage;

public class SumAverage2 {
	int sum;
	int avg;
	int a;
	int b;
	public SumAverage2(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		//sum=a+b;
		this.sum();
	}
	
	public void sum() {
		sum=a+b;
	}
	
	public int avg() {//default method
		avg=sum/2;		
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAverage2 ob1=new SumAverage2(10,20);
		int d=ob1.avg();
		System.out.println("The average is "+d);
		
	}
}

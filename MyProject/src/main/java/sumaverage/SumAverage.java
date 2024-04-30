//To find average using default instance method, values should be passed at the time of object creation.

package sumaverage;

public class SumAverage {
	int sum;
	int avg;
	public SumAverage(int a, int b) {
		// TODO Auto-generated constructor stub
		sum=a+b;
	}
	
	public int avg() {//default method
		avg=sum/2;		
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAverage ob1=new SumAverage(10,20);
		int d=ob1.avg();
		System.out.println("The average is "+ob1.avg);
		
	}
}

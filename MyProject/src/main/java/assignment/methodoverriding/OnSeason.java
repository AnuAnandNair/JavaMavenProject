package assignment.methodoverriding;

public class OnSeason extends OffSeason{
	int discount=40;	
	
	public void discount() {
		super.discount();
		float discount_amount=(price*discount)/100;
		float final_price=price-discount_amount;
		System.out.println("The discount price during OnSeason is "+final_price);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnSeason os1=new OnSeason();
		os1.discount();
	}
}

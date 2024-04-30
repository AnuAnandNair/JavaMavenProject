//Write a program to calculate discount if customer purchases clothes on
//Offseason, set discount 15% and onSeason 40%
//Should use two classes, OnSeason and OffSeason. Use two methods- discount
//Method names should be same


package assignment.methodoverriding;

public class OffSeason {
	int discount=15;
	int price=600;
	
	public void discount() {
		float discount_amount=(price*discount)/100;
		float final_price=price-discount_amount;
		System.out.println("The discount price during OffSeason is "+final_price);
	}
}



//Write a program to get the details of a Student ﻿ 
//Class 1 - Student ﻿  Get the student name and roll number ﻿ 
//Class 2- Address ﻿  Get the address of student ﻿ 
// Print Student name, roll number with address ﻿ 
// There is no IS-A relationship 

package aggregation;

public class Address {
	int housenum;
	String housename;
	String city;
	int pincode;
	
	public Address(int housenum, String housename, String city, int pincode) {
		this.housenum=housenum;
		this.housename=housename;
		this.city=city;
		this.pincode=pincode;
	}
}

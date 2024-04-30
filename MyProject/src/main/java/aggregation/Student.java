package aggregation;

public class Student {
	String name;
	int rollno;
	
	Address add;
	
	public Student(String name, int rollno, Address add) {
		this.name=name;
		this.rollno=rollno;
		this.add=add;
	}
	
	public void printDetails() {
		System.out.println("Studentname: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("House No: "+add.housenum);
		System.out.println("House Name: "+add.housename);
		System.out.println("City: "+add.city);
		System.out.println("Pincode: "+add.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address ob=new Address(80,"Anaswara","Trivandrum",695013);
		Student s=new Student("Anu",5,ob);
		s.printDetails();
		
		
	}

}

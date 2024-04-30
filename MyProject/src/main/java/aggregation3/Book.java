package aggregation3;

public class Book {
	
	  String name;
	  int price;
	  // author details
	  Author auth;
	  
	  Book(String n, int p, Author auth){  
			    this.name = n;
			    this.price = p;
			    this.auth = auth;
	  }
	  
	  public static void main(String[] args) {
			    Author auth = new Author("John", 42, "USA");
			    Book b = new Book("Java for Begginer", 800, auth);
			    System.out.println("Book Name: "+b.name);
			    System.out.println("Book Price: "+b.price);
			    System.out.println("------------Author Details----------");
			    System.out.println("Author Name: "+b.auth.authorName);
			    System.out.println("Author Age: "+b.auth.age);
			    System.out.println("Author place: "+b.auth.place);
	  }	
}

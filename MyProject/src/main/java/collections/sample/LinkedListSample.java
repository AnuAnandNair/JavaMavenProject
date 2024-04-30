package collections.sample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample {
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("Dona");
		li.add("Anu");
		li.add("Arjun");
		System.out.println(li);
		
	    //Adding an element at the specific position  
        li.add(1, "Gaurav");  
        System.out.println("After invoking add(int index, E element) method: "+li); 
        
        //addAll()
    	LinkedList<String> li2=new LinkedList<String>();
    	li2.add("Anand");
		li2.add("Asha");
		li2.add("Sree");
		System.out.println(li2);
		
		li.addAll(li2);
		System.out.println(li);
		
		  //Adding an element at the first position  
        li.addFirst("Ammu");  
        System.out.println("After invoking addFirst(E e) method: "+li);  
        //Adding an element at the last position  
        li.addLast("Harsh");  
        System.out.println("After invoking addLast(E e) method: "+li);  
        
        //remove()
      //Removing specific element from arraylist  
        li.remove("Sree");  
        System.out.println("After invoking remove(object) method: "+li);   
        //Removing element on the basis of specific position  
        li.remove(0);  
        System.out.println("After invoking remove(index) method: "+li);
        
        //Removing all the new elements from arraylist  
        li.removeAll(li2);  
        System.out.println("After invoking removeAll() method: "+li);   
        
        //Removing first element from the list  
        li.removeFirst();  
        System.out.println("After invoking removeFirst() method: "+li);  
    //Removing first element from the list  
        li.removeLast();  
        System.out.println("After invoking removeLast() method: "+li);  
        
        
        
        //Removing all the elements available in the list       
        li.clear();  
        System.out.println("After invoking clear() method: "+li); 
        
        
        LinkedList<String> li3=new LinkedList<String>();  
        li3.add("Ravi");  
        li3.add("Vijay");  
        li3.add("Ajay");  
        //Traversing the list of elements in reverse order  
        Iterator i=li3.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
          
 
 
	}	
}

package collections.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetSample {
	public static void main(String[] args) {
		   Set<String> data = new LinkedHashSet<String>();   
		    
	        data.add("JavaTpoint");   
	        data.add("Set");   
	        data.add("Example");   
	        data.add("Set");   
	    
	        System.out.println(data);   
	        
	        Set<Integer> data1 = new LinkedHashSet<Integer>();   
	        data1.add(31);   
	        data1.add(21);   
	        data1.add(41); 	        
	        System.out.println("Set: " + data1);  	        
        
	        ArrayList<Integer> newData = new ArrayList<Integer>();   
	        newData.add(91);   
	        newData.add(71);   
	        newData.add(81);  
	        data1.addAll(newData);   
	        System.out.println("Set: " + data1);  
	        
	        data1.removeAll(newData); 
	        System.out.println("data after removing Newdata elements : " + data1);         
	        
	        Set<Integer> data2 = new LinkedHashSet<Integer>();   
	        
	        data2.add(31);   
	        data2.add(21);   
	        data2.add(41);   
	        System.out.println("Set: " + data2);  
	          
	        data2.clear();   
	        System.out.println("The final set: " + data2);
	        
	        Set<Integer> d = new LinkedHashSet<Integer>();   
	        d.add(31);   
	        d.add(21);   
	        d.add(41);   
	        d.add(51);   
	        d.add(11);   
	        d.add(81);   
	        System.out.println("Set: " + d);  
	        System.out.println("Does the Set contains '91'?" + d.contains(91));   
	        System.out.println("Does the Set contains '51'? " + d.contains(51));  
	        
	        System.out.println("\nIs data empty?: "+ d.isEmpty());      
	        
	        Iterator n = d.iterator();  
	        System.out.println("The NewData values are: ");   
	        while (n.hasNext()) {   
	            System.out.println(n.next());   
	        }  
	        d.remove(81);  
	        d.remove(21);  
	        d.remove(11);      
	        System.out.println("data after removing elements: " + d);  
	        
	        System.out.println("size of the data is : " + d.size());       
	}

}

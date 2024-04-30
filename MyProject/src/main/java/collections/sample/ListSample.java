package collections.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();//List is interface. So, its object can be created using class as 
		//InterfaceName objName=new Classname(); Here, we use ArrayList as class
		
		list.add("Anu");
		list.add("Dona");
		list.add("Midhun");
		list.add("");  //adding null
		System.out.println(list);
		
		for(String s:list) {//for each loop
			System.out.println(s);
		}
		
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}

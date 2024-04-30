package collections.sample;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("Anu");
		s.add("Dona");
		s.add("Arjun");
		s.add("Anand");
		System.out.println(s);
		s.remove(2);
		System.out.println(s);
		int x=s.size();
		System.out.println(x);
		System.out.println(s.get(1));
		System.out.println(s.contains("Anu"));
		
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("Asha");
		s1.add("Gopika");
		s1.add("Sree");
		s1.add("Aami");
		System.out.println(s1);
		s1.addAll(s);
		System.out.println(s1);
	}

}

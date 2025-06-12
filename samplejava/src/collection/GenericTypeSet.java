package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericTypeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s = new HashSet<String>();
		
		//add()
				
		s.add("Colours");
		s.add("White");
		s.add("blue");
		System.out.println(s);
		
		//addaAll
		Set <String> a = new HashSet<String>();
		a.add("Apple");
		a.add("Grapes");
		a.add("orange");
		a.addAll(a);
		System.out.println(a);
		//contains
		System.out.println(s.contains("white"));
		System.out.println(a.containsAll(s));
		
		//removeAll
		s.remove("Blue");
		System.out.println(s);
		
		//clear
		s.clear();
		System.out.println(s);
				
				
		
		//contains()
		System.out.println(s.contains("Colours"));
		
		//isEmpty()
		System.out.println(s.isEmpty());
		
		//remove()
		s.remove("White");
		
		//size()
		System.out.println(s.size());
	}

}

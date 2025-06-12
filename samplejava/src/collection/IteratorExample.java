package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set <String> s = new HashSet <String>();
        s.add("Apple");
        s.add("Orange");
        s.add("Grapes");
        System.out.println(s);
        Iterator i = s.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        i.remove();
        System.out.println(s);
	
	int a[]= {1,2,3,4,5};
	//for each loop
	for(int b:a) // for(type variable:ArrayName)
	{
		System.out.println(b);
	}

	}
}

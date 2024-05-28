package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		//HashSet hs = new HashSet(100);                 // Default capacity can increase like this
		//HashSet hs = new HashSet(100,(float) 0.75);   //  Declare capacity with load factor as well
		//HashSet<Integer> hs = new HashSet<Integer>();  
		
		HashSet hs = new HashSet();  //default capacity is 16 and load factor 0.75
		
		hs.add("raj");
		hs.add(11);
		hs.add(null);
		hs.add(7.98);
		
		System.out.println(hs);
		hs.remove(7.98);
		System.out.println(hs);
		System.out.println(hs.contains(7.98));
		
		for(Object e : hs)
		{
			System.out.println(e);
		}
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}

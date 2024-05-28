package CollectionDemo;

import java.util.HashSet;

public class HashSet3 {

	public static void main(String[] args) {
		
		//Subset, Intersection, Difference and Union
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
	//	hs.add(6);
			
		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(2);
		hs1.add(5);
		hs1.add(7);
		hs1.add(9);
		System.out.println(hs1);
		
		//hs.addAll(hs1);  // find union value
		//System.out.println(hs);
		
		//hs.retainAll(hs1);  // find intersection value 
		//System.out.println(hs);
		
		hs.removeAll(hs1);  // Difference value
		System.out.println(hs);
		
		System.out.println(hs.containsAll(hs1)); //Subset boolean value 
	}

}

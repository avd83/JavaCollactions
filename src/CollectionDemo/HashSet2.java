package CollectionDemo;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		hs.add(8);
		hs.add(0);

		System.out.println(hs);
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(2);
		hs1.add(4);
		hs1.add(6);
		
		System.out.println(hs1);
		
		hs.addAll(hs1);
		System.out.println(hs);
		hs1.removeAll(hs1);
		System.out.println(hs1);		
	}
}

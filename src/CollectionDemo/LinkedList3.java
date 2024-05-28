package CollectionDemo;

import java.util.LinkedList;

public class LinkedList3 {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("Dog");
		l.add("Cat");
		l.add("Rat");
		l.add("Dog");
		
		System.out.println(l);
		l.addFirst("Tiger");
		System.out.println(l);
		l.addLast("Lion");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.clone());
		
	}

}

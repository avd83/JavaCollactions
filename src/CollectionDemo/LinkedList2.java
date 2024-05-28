package CollectionDemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("G");
		l.add("K");
		l.add("F");
		
		LinkedList<String> nl = new LinkedList<String>();
		nl.add("c");
		nl.add("j");
		nl.add("t");
		
		nl.addAll(l);
		System.out.println(nl);
		nl.removeAll(l);
		System.out.println(nl);
		Collections.shuffle(nl);
		System.out.println(nl);
		Collections.sort(nl);
		System.out.println(nl);
		Collections.sort(nl,Collections.reverseOrder());
		System.out.println(nl);		
	}

}

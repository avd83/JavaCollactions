package CollectionDemo;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("F");
		al.add("E");
		al.add("B");
		
		System.out.println(al);
		
		ArrayList<String> dup = new ArrayList<String>();
		dup.addAll(al);
		System.out.println(dup);
		
		dup.removeAll(al);
		System.out.println(dup);
		
		
		Collections.sort(al);
		System.out.println("After sorting list"+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After sorting list in desecnding"+al);
		
		Collections.shuffle(al);
		System.out.println("After shuffling list"+al);
	}	

}

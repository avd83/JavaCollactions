package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(100);
		lhs.add(300);
		lhs.add(200);
		lhs.add(700);
		lhs.add(700);
		
		System.out.println(lhs);
		System.out.println(lhs.clone());
		List l =new ArrayList(lhs); 
		Collections.shuffle(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
	}

}

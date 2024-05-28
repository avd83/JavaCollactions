package CollectionDemo;

import java.util.ArrayDeque;

public class ArrayDequeue {

	public static void main(String[] args) {
		
		ArrayDeque<String> ad = new ArrayDeque<String>();//FIFO
		ad.add("abhay");
		ad.add("mihika");
		ad.add("mitansh");
		
		System.out.println(ad);
		
		ad.remove();
		System.out.println(ad);
	}
}

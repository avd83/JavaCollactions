package CollectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		 
		//LinkedList<String> l = new LinkedList<String>();
		//LinkedList<Integer> l = new LinkedList<Integer>();
		
		LinkedList l= new LinkedList();
		l.add("abhay");
		l.add(13);
		System.out.println(l);
		l.add(1, 55);
		l.add(5.5);	
		l.add("A");
		l.add(null);
		System.out.println(l);
		System.out.println(l.size());
		l.remove(4);
		System.out.println(l);
		l.add(4, "B");
		System.out.println(l);
		l.addFirst("LinkedList");//linkedlist method
		System.out.println(l);
		l.addLast("LinkedList1");//linkedlist method
		System.out.println(l);
		l.set(6,10.34);
		System.out.println(l);
		System.out.println(l.get(7));
		
		System.out.println("for loop ==============");
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("for each ==============");
		for(Object e:l)
		{
			System.out.println(e);
		}
		
		System.out.println(" Iterator==============");
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

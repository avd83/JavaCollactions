package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		
		//ArrayList<String> al = new ArrayList<String>();
		//ArrayList<Integer> al = new ArrayList<Integer>();
		//List al = new ArrayList();
		
		ArrayList al = new ArrayList();
		al.add("abahy");
		al.add(44);
		al.add(22.5);
		al.add(true);
		System.out.println(al);
		al.remove(1);
		System.out.println(al.size());
		al.add(3,22);
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.isEmpty());
		al.set(0,"amol");
		System.out.println(al.contains("amol"));
		System.out.println(al);
		
		System.out.println("for loop ==============");
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("for each ==============");
		for(Object e:al)
		{
			System.out.println(e);
		}
		
		System.out.println(" Iterator==============");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

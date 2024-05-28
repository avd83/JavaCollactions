package MapDemo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashTable {

	public static void main(String[] args) {
		
		//Hashtable ht = new Hashtable();
		//Hashtable ht = new Hashtable(100);
		//Hashtable ht = new Hashtable(100,(float) 0.75);capacoty and load factor
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(101, "jhon");
		ht.put(102, "david");
		ht.put(103, "smith");
		ht.put(103, "1");
		//ht.put(null, "");//null pointer exception
		
		System.out.println(ht);
		System.out.println(ht.get(103));
		ht.remove(103);
		System.out.println(ht);
		System.out.println(ht.containsValue("jhon"));
		System.out.println(ht.containsKey(102));
		
		System.out.println(ht.keySet());		
		for(int k : ht.keySet())
		{
			System.out.println(k);
		}
		
		System.out.println(ht.values());		
		for(String s : ht.values())
		{
			System.out.println(s);
		}
		System.out.println("==========Entry method==========");
		
		System.out.println(ht.entrySet());
		
		for(Map.Entry entry : ht.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("==========Iterator==========");
		Set s = ht.entrySet();
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			//it.next();
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			//System.out.println(it.next());
		}
	}

}

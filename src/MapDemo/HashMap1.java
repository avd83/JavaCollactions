package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//HashMap hm = new HashMap();
				
		hm.put(101,"abhay");
		hm.put(102,"apoorv");
		hm.put(103,"rudra");
		hm.put(103, "mitansh");
		hm.put(104,"mihika");
		hm.put(null,"mitansh");
		hm.put(105,"");
		
		
		System.out.println(hm);
		
		System.out.println(hm.get(103));
		hm.remove(103);
		System.out.println(hm);
		System.out.println(hm.containsValue("apoorv"));
		System.out.println(hm.containsKey(103));
		
		System.out.println(hm.keySet());
		for(Object e : hm.keySet())
		{
			System.out.println(e);
		}		
		System.out.println(hm.values());
		
		for(Object e : hm.values())
		{
			System.out.println(e);
		}
		System.out.println(hm.entrySet());//return in set object
		
		for(Object e : hm.entrySet())
		{
			System.out.println(e);
		}
		
		System.out.println("==========Entry method==========");
		
				for(Map.Entry entry :hm.entrySet())
				{
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
		System.out.println("============Iterator=============");
				
		Set s = hm.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Entry) it.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
			//System.out.println(it.next());
		}
		
	}

}

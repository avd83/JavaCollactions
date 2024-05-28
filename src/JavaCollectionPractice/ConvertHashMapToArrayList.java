package JavaCollectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {

		HashMap<String,Integer> empMap = new HashMap<>();
		empMap.put("LAI",600);
		empMap.put("TCS",10600);
		empMap.put("Inf",16000);
		empMap.put("SAP",6000);
		
		System.out.println(empMap);
		
		System.out.println("------------------");
		empMap.forEach((k,v)->System.out.println("Key = "+ k  + "Value = "+ v));
		
		System.out.println("------------------");
		
		Iterator it = empMap.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------");
		//Convert keys into arraylist
		ArrayList<String> compName = new ArrayList<String>(empMap.keySet());
		System.out.println(compName);
		
		System.out.println("------------------");
		//Convert Values into arraylist
		List<Integer> empCount =  new ArrayList<Integer>(empMap.values());
		System.out.println(empCount);
		
		
		
		
		
		
		
		
		
		
	}

}

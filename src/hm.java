import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hm {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0,"Morning");
		hm.put(1,"Afternoon");
		hm.put(2,"Night");
		
		System.out.println(hm);
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			
			System.out.println(mp.getValue());
			
		}
		

	}

}

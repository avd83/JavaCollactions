import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
	
	HashSet<String> hs = new HashSet<String>();
	hs.add("India");
	hs.add("UK");
	hs.add("India");
	hs.add("usa");
	System.out.println(hs);
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	
	System.out.println("-------");
	
	Iterator<String> i = hs.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next());
	}

	}

}

import java.util.ArrayList;

public class ArrayList1 {

	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("abhay");
		a.add("apoorv");
		a.add("jitu");
		System.out.println(a);
		a.add(2, "Shrini");
		System.out.println(a);
		System.out.println(a.contains("pallavi"));//checking value present in list or not and return boolean value
		System.out.println(a.get(2));//Index value print from list
		a.clone();
		System.out.println(a);//create clone of the list again
		System.out.println(a.indexOf(a));
		System.out.println(a.remove(2));
	
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("abhay");
		b.add("apoorv");
		b.add("jitu");
		b.add(2, "Shrini");
		System.out.println(a.equals(b));// sequence as well as value of the list should be same and compare in this method.
		
		ArrayList<String> c = new ArrayList<String>();
		System.out.println(c.indexOf(c));
		System.out.println(c.isEmpty());//giev arraylist is empty or not in boolean 
		
	}

}

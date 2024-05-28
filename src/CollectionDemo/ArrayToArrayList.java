package CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		String arr[] = {"dog","cat","tiger"};
		
		for(Object value:arr)
		{
			System.out.println(value);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
		
	}

}

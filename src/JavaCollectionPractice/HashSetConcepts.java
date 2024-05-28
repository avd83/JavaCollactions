package JavaCollectionPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6}));
		
		Set<Integer> second = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,7,4,9,8}));
		
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		
		Set<Integer> intersection = new HashSet<Integer>(first);
		intersection.retainAll(second);
		System.out.println(intersection);
		
		Set<Integer> diffrance = new HashSet<Integer>(first);
		diffrance.removeAll(second);
		System.out.println(diffrance);		
	}
}

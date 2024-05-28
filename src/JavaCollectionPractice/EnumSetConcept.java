package JavaCollectionPractice;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {	
	
	enum Lang{		
		Java,
		PlyaWrite,
		Cyprass,
		JavaScript
	}
	
	public static void main(String[] args) {
		//Create new enumSet using enum
		EnumSet<Lang> lang = EnumSet.allOf(Lang.class);
		System.out.println(lang);
		
		//Create new empty enumSet 
		EnumSet<Lang> lang1 = EnumSet.noneOf(Lang.class);
		System.out.println(lang1);
		
		//Create range wise enumSet 
		EnumSet<Lang> lang3 = EnumSet.range(Lang.PlyaWrite,Lang.Cyprass);
		System.out.println(lang3);		
		
		//Create multiple wise enumSet 
		EnumSet<Lang> lang4 = EnumSet.of(Lang.JavaScript,Lang.Cyprass);
		System.out.println(lang4);
		
		//Iterate element from enumSet 
		Iterator<Lang> l = lang.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		//remove element from enumSet 
		EnumSet<Lang> lang5 = EnumSet.allOf(Lang.class);
		lang5.remove(Lang.Java);
		System.out.println(lang5);	
	}
}

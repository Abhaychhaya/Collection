package SetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> LH = new LinkedHashSet<String>();
		LH.add("Ram");
		LH.add("Kamla");
		LH.add("Mohan");
		LH.add("Ram");
		LH.add("Abhay");
		LH.add("Abhay");
		LH.add("Kishor");
		
		Iterator<String> atr = LH.iterator();
		while(atr.hasNext()) {
			
			System.out.println(atr.next());
		}

	}

}

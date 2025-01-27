package SetDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> HS = new HashSet<String>();
		HS.add("Ram");
		HS.add("Kamla");
		HS.add("Mohan");
		HS.add("Ram");
		HS.add("Abhay");
		HS.add("Abhay");
		HS.add("Kishor");
		
		//Create Iterator
		
		Iterator<String> atr = HS.iterator();
		while(atr.hasNext()) {
			
			System.out.println(atr.next());
		}

	}

}

package SetDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> TS = new TreeSet<String>();
		TS.add("Ram");
		TS.add("Kamla");
		TS.add("Mohan");
		TS.add("Ram");
		TS.add("Abhay");
		TS.add("Abhay");
		TS.add("Kishor");
		Iterator<String> atr = TS.iterator();
		while(atr.hasNext()) {
			
			System.out.println(atr.next());
		}

	}

}

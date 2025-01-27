package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Ram");
		LL.add("Kamla");
		LL.add("Mohan");
		LL.add("Ram");
		LL.add("Abhay");
		LL.add("Abhay");
		LL.add("Kishor");
		
		//Create Iterator
		
		Iterator<String> atr = LL.iterator();
		while(atr.hasNext()) {
			
			System.out.println(atr.next());
		}

	}

}

package List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("Ram");
		AL.add("Kamla");
		AL.add("Mohan");
		AL.add("Ram");
		AL.add("Abhay");
		AL.add("Abhay");
		AL.add("Kishor");
		
		//Create Iterator
       Iterator<String> atr = AL.iterator();
       while(atr.hasNext()) {
    	   
    	   System.out.println(atr.next());
    	   
    	   
    	   }
       
       System.out.println("==============================");
       System.out.println("After Remove in Array List Data");
       AL.remove(0);
	   
	   Iterator<String> rm = AL.iterator();
	   
	   while(rm.hasNext()) {
		   
		   System.out.println(rm.next());
       }
       
         
	}

}

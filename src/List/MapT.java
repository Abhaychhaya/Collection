package List;

import java.util.HashMap;
import java.util.Map;

public class MapT {

	public static void main(String[] args) {
		 
			  Map<Integer,String> map=new HashMap<Integer,String>();  
			  map.put(100,"Amit");  
			  map.put(101,"Vijay");  
			  map.put(104,"Rahul");  
			  map.put(103, "Alok");
			  //Elements can traverse in any order  
			  for(Map.Entry<Integer,String> m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());
	        	
		  }	  

	}

}

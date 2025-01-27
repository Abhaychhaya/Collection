package SetDemo;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> TM = new TreeMap<String,Integer>();
		TM.put("Abhay",101);
		TM.put("Brijesh",104);
		TM.put("Kamla",102);
		TM.put("Abhay",103);
		TM.put("Ram",105);
		TM.put("Pankaj",106);
		TM.put("Roshan",107);
		
		for(Map.Entry<String,Integer> m:TM.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}

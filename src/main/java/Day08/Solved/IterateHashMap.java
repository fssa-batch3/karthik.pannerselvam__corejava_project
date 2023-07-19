package Day08.Solved;
import java.util.*;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("Chennai", 2);
	        map.put("Bangalore", 1);
	        map.put("Mumbai", 2);
	        map.put("Hyderabad", 1);
	        
	        // Method 1: Foreach
	        System.out.println("Method 1 Foreach ");
	        Set<String> keySet = map.keySet();
	        for (String key: keySet) {
	            System.out.println(key + " = " + map.get(key));
	        }
	        
	        // Method 2: Iterator
	        System.out.println("Method 2 Iterator");
	        Iterator<String> it = map.keySet().iterator();
	        while (it.hasNext()) {
	            String key = it.next();
	            System.out.println(key + " = " + map.get(key));
	        }
	        
	        // Method 3: Lambda expression
	        System.out.println("Method 3 Lambda expression");
	        map.forEach((key,value) -> System.out.println(key + " = " + value));
	}

}

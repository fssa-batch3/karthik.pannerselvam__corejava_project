package Day08.Solved;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> deptMap = new HashMap<String,Integer>();
		deptMap.put("HR",10);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);
		
		for(String deptName: deptMap.keySet()) {
			Integer count = deptMap.get(deptName);
			System.out.println("Department Name: " + deptName + " and Employee Count : " + count);
		}
	}

}

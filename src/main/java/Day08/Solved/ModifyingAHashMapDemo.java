package Day08.Solved;
import java.util.*;

public class ModifyingAHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> deptMap = new HashMap<String, Integer>();
		deptMap.put("HR", 5);
		deptMap.put("ADMIN", 10);
		deptMap.put("DEVELOPERS", 300);

		deptMap.remove("DEVELOPERS");
		
		// Modifying a particular count
		int hrCount = deptMap.get("HR");
		hrCount += 1;
		deptMap.put("HR", hrCount);

		// Iterate
		for (String deptName : deptMap.keySet()) {

			Integer count = deptMap.get(deptName);
			System.out.println("Department Name:" + deptName + " and Employee Count :" + count);

		}
	}

}

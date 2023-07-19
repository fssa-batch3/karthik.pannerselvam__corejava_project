package Day07.Practice;
import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(5);
		numbers.add(4);
		numbers.add(3);
		
		System.out.println("Before removing duplicate - " + numbers);
		
		HashSet<Integer> filtered  = new HashSet<Integer>(numbers);
		System.out.println("After Removing the duplicates - " + filtered);
	}

}

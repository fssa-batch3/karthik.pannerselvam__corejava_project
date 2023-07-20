package Day09.Practice;
import java.util.*;
public class SortingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> inputList = new ArrayList<>();
		System.out.println("Enter the number of integers : ");
		int integers = scan.nextInt();
		
		
		for(int i=0; i<integers; i++) {
			System.out.println("Enter the " + (i+1) + " integer:" );
			inputList.add(scan.nextInt());
			
		}
		scan.close();
		System.out.println("Before Sorting " + inputList);
		Collections.sort(inputList);
		System.out.println("After Sorting " + inputList);
		
	}

}

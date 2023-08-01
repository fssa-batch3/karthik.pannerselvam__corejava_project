package day08.Solved;
import java.util.*;
import Day08.Practice.ListOfEmployees;

public class TestNamesCountWithHashMap {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a comma seperated list of names");
		String str = scan.nextLine();
		scan.close();

		TestNamesCountWithHashMap names = new TestNamesCountWithHashMap();

		System.out.println("The count of the list of names");

		System.out.println(names.count(str));

	}

	private char[] count(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}

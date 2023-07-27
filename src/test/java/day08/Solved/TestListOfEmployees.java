package day08.Solved;

import java.util.HashMap;
import java.util.Scanner;

public class TestListOfEmployees {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the comma seperated Names ");
		String list = scan.nextLine();
		
		String[] arr = list.split(",");
		
		HashMap<String, Integer> setlist = new HashMap <String, Integer>();
		
		for(int i =0;i<arr.length;i++) {
			if(setlist.containsKey(arr[i])) {
				int c = setlist.get(arr[i]);
				c++;
				setlist.put(arr[i], c);
			}else {
				setlist.put(arr[i], 1);
			}
			
		}
		
		System.out.println(setlist);
		scan.close();
	}
}

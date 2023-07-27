package Day06.Practice;


import java.util.*;

public class ArrList{

public static void main(String[] args) {
	// TODO Auto-generated method stub
	List<String> cityList = new ArrayList<String>();
	cityList.add("Chennai");
	cityList.add("Bangalore");
	cityList.add("Mumbai");
	cityList.add("Mumbai");
	
	List<String> newCity = new ArrayList<String>();
	
	for(String city: cityList) {
		
		boolean cityExists = false;
		
		for(String ExistingCity: newCity) {
			
			if(ExistingCity.equals(city)) {
				cityExists = true;
			}
		}
		
		if(!cityExists) {
			newCity.add(city);
	}	
		
	
	}
	
	for(String city: newCity) {
		System.out.println(city);
	}
}
}

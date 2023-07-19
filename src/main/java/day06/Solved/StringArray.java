package day06.Solved;

public class StringArray {
	// How its stored in an normal array
	public static void main(String[] args) {

			String[] cityArr = new String[3];
			cityArr[0] = "Chennai";
			cityArr[1] = "Bangalore";
			cityArr[2] = "Mumbai";
			                       
			
			// Display the city names
			for (String cityName : cityArr) {
				System.out.println(cityName);
			}
}
}

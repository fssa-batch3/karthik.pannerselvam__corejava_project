package Day07.Solved;
import java.util.TreeSet;

public class TreeSetDemo {
	   public static void main(String[] args) {
		   
	        // TreeSet sorts the collections
	        TreeSet<String> cityNames = new TreeSet<String>();
	        cityNames.add("Assam");
	        cityNames.add("Delhi");
	        cityNames.add("delhi");
	        cityNames.add("Chennai");
	        cityNames.add("Bangalore");
	 
	        for (String cityName : cityNames) {
	            System.out.println(cityName);
	        }
	         
	    }
}
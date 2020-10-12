import java.util.HashSet;
import java.util.Set;
//import java.util

public class Generics1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("One");
		//set.add(2);
		set.add("Three");
		System.out.println(set);
		for (String number : set) {
			System.out.println(number);
		}
		
	}
}

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();

		set1.add("スイカ");
		set1.add("メロン");
		System.out.println(set1);
		
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
		
		System.out.println(set1.size());
		
		set1.remove("スイカ");
		set1.remove("なし");
		System.out.println(set1);
	}
}

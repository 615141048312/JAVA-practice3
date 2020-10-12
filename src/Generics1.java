import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Generics1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("One");
		//set.add(2);　コンパイルエラー
		set.add("Three");
		System.out.println(set);
		for (String number : set) {
			System.out.println(number);
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("サクラ属", "サクランボ");
		//map.put(1, "ムカゴ");　コンパイルエラー
		map.put("モモ属", "モモ");
		map.get("サクランボ");
		//map.get(1);　コンパイルエラー
	}
}

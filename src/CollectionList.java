import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		
		list1.add("りんご");
		list1.add("みかん");
		list1.add(1, "バナナ");
		
		System.out.println(list1);
		
		System.out.println(list1.get(0));
		
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("なし"));
		
		System.out.println(list1.size());
		
		list1.remove("バナナ");
		list1.remove("なし");
		System.out.println(list1);
		
		list1.remove(0);
		System.out.println(list1);
	}
}

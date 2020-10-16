public class Lambda02 {
	public static void main(String[] args) {
		Greeting greeting = () -> {
			  return "こんにちは";
		};
		
		System.out.println(greeting.hello());
	}
}

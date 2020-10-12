package basket;

import java.math.BigDecimal;

public class appleBasket {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		appleBasket.printName();

		//appleBasket.replace(new Apple("紅玉"));
		//System.out.println(appleBasket.get().getName());

		appleBasket.printPrice();
	}
}

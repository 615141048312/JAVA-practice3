package basket;

import java.math.BigDecimal;

public class PeachBasket {
	public static void main(String[] args) {
		Basket<Peach> peachBasket = new Basket<>(new Peach("川中島白桃", new BigDecimal(300)));
		peachBasket.printPrice();
	}
}

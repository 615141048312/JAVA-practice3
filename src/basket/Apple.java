package basket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class Apple extends Fruit {
	Apple(String name, BigDecimal price){
		super(name,price);
	}

	@Override
	protected String getName() {
		return name;
	}

	@Override
	protected BigDecimal getPrice() {
		return price;
	}


	List<Apple> apples = new ArrayList<>();
	List<? extends Fruit> fruits = apples;
}
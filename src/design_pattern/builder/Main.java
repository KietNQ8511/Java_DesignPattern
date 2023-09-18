package design_pattern.builder;

public class Main {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder()
				.orderType(OrderType.ON_SITE)
				.orderBread(BreadType.OMELETTE)
				.orderSauce(SauceType.SOY_SOUCE)
				.build();
		System.out.println(order);
	}
}

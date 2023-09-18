package design_pattern.abstract_factory;

public class Main {
	public static void main(String[] args) {
		FurnitureAbstractFactory fac = FurnitureFactory.getFactory(MaterialType.PLASTIC);
		Chair chair = fac.createChair();
		chair.create();
		
		Table table = fac.createTable();
		table.create();
	}
}

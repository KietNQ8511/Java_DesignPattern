package design_pattern.abstract_factory;

public class FurnitureFactory {
	public FurnitureFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
		switch(materialType) {
			case PLASTIC:
				return new FlasticFactory();
			case WOOD:
				return new WoodFactory();
			default:
				throw new UnsupportedOperationException("This furniture is unsupported");
		}
	}
}

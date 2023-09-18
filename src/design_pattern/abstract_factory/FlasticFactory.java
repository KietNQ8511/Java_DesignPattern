package design_pattern.abstract_factory;

public class FlasticFactory implements FurnitureAbstractFactory {

	@Override
	public Chair createChair() {
		return new PlasticChair();
	}

	@Override
	public Table createTable() {
		return new PlasticTable();
	}
	
}

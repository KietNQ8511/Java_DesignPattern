package design_pattern.abstract_factory;

public class PlasticChair implements Chair {

	@Override
	public void create() {
		System.out.println("PlasticChair created");
	}

}

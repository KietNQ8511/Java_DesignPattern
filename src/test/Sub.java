package test;

public class Sub extends Parent {
	private static final int BIT_FLAG_PROPERTY_HVAC = 3 << 4;
	public static void main(String[] args) {
		Sub sub = new Sub();
		Main main = new Main();
		
		System.out.println(BIT_FLAG_PROPERTY_HVAC);
	}
}

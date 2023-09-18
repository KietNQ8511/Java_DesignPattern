package test;

public class MyClass implements MyInterface {
	String name;
	
	public MyClass(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void join(String s) {
		System.out.println("Join String " + s);
	}
	
}

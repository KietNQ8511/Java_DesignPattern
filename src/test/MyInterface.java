package test;

public interface MyInterface {
	public String getName();
	public void join(String s);
	default void show() {
		System.out.println(this.getName() + " get name");
	}
}

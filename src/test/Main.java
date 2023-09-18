package test;

public class Main {
	private static int a = 0;
	
	public Main() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor");
		System.out.println(a);
	}
	
	static {
		System.out.println(++a);
	}
	
	static {
		System.out.println("ss");
	}
	public static void main(String[] args) {
//		Main main = new Main();
		new Main();
	}
}

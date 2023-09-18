package reflection;

import lombok.Data;

@Data
public class Person {
	private String name;
	
	public void name1() {
		System.out.println("name 1 method run");
	}
	
	public void name2(String name2) {
		System.out.println("name 2 method run " + name2);
	}
}

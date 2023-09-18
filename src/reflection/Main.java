package reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Class<?> anoClass = null;
		try {
			anoClass = Class.forName("reflection.Person");
			Person person = new Person();
//			Method method = anoClass.getMethod("name1", null);
//			Method method = anoClass.getMethod("name2", String.class);
			List<Method> methods = new ArrayList<>();
			methods.add(anoClass.getMethod("name1", null));
			methods.add(anoClass.getMethod("name2", String.class));

			for (Method method : methods) {
				if (method.getParameterCount() == 0) {
					method.invoke(person, null);
				} else {
					method.invoke(person, "NAME2");
					method.invoke(methods);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("class : " + anoClass.getName());

	}
}

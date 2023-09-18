package design_pattern.observer;

public class Main {
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		Observer observer1 = new Observer() {
			
			@Override
			public void update(String message) {
				System.out.println("Message 1 : " + message);
			}
		};
		
		subject.attach(observer1);

		Observer observer2 = new Observer() {
			
			@Override
			public void update(String message) {
				System.out.println("Message 2 : " + message);
			}
		};
		
		subject.attach(observer2);
		subject.notifyChange("Test change state 1");
		subject.attach(observer1);
		subject.notifyChange("Test change state 2");
	}
}

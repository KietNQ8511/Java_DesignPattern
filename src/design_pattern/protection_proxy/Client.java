package design_pattern.protection_proxy;

public class Client {
	public static void main(String[] args) {
		UserService admin = new UserServiceProxy(null, null);
	}
}

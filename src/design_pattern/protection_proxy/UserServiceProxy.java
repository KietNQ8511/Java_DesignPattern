package design_pattern.protection_proxy;

public class UserServiceProxy implements UserService {

	private String role;
	private UserService userService;
	
	public UserServiceProxy(String name, String role) {
		// TODO Auto-generated constructor stub
		this.role = role;
		this.userService = new UserServiceImpl(name);
	}
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		userService.load();
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		if (isAdmin()) {
			userService.insert();
		} else {
			throw new IllegalAccessError("Access denied");
		}
	}
	
	public boolean isAdmin() {
		return "admin".equalsIgnoreCase(this.role);
	}
}

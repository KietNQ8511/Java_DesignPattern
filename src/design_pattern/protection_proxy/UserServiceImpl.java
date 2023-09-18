package design_pattern.protection_proxy;

public class UserServiceImpl implements UserService {

	private String name;
	
	public UserServiceImpl(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void load() {
		// TODO Auto-generated method stub
		System.out.println(name + " Loaded");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println(name + " inserted");
	}
	
}

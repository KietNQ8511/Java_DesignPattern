package test;

public abstract class MyAbstract implements MyInterface {
	
	protected MyInterface myInterface;
	
	public MyAbstract(MyInterface myInterface) {
		// TODO Auto-generated constructor stub
		this.myInterface = myInterface;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return myInterface.getName();
	}
	
	@Override
	public void join(String s) {
		// TODO Auto-generated method stub
		myInterface.join(s);
	}
}

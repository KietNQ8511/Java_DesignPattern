package design_pattern.composite;

public class FileLeaf implements FileComponent {
	
	private String name;
	private long size;
	
	public FileLeaf(String name, long size) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.size = size;
	}
	
	@Override
	public void showProperty() {
		// TODO Auto-generated method stub
		System.out.println("FileLeaf [name=" + name + ", size=" + size + "]");
	}
	
	@Override
	public long totalSize() {
		// TODO Auto-generated method stub
		return size;
	}
}

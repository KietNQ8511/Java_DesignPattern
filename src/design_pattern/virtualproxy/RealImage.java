package design_pattern.virtualproxy;

public class RealImage implements Image {

	String url;
	
	public RealImage(String url) {
		this.url = url;
		System.out.println("Image loaded: " + this.url);
	}
	
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		System.out.println("Image showed: " + this.url);
	}

}

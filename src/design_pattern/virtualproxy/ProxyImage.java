package design_pattern.virtualproxy;

public class ProxyImage implements Image {

	private Image realImage;
	private String url;
	
	public ProxyImage(String url) {
		this.url = url;
		System.out.println("Image unload : " + this.url);
	}
	
	@Override
	public void showImage() {
		// TODO Auto-generated method stub
		if (realImage == null) {
			realImage = new RealImage(this.url);
		} else {
			System.out.println("Image already existed : " + this.url);
		}
		
		realImage.showImage();
	}
	
	
}

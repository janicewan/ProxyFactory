package images;

public class Proxy implements Image {

	private String imageURL;
	private Image image;
	private boolean type;

	public Proxy(String imageURL, boolean type) {
		this.imageURL= imageURL;
		this.type = type;
	}
	
	public String showImage(boolean type) {
		image = new RealSubject(imageURL);
		return image.showImage(type);
	}
}
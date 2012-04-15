package images;

public class ImageFactory implements Image {

	private String imageURL;
	private Image image;
	private boolean localType;

	public ImageFactory(String imageURL, boolean type) {
		this.imageURL= imageURL;
		this.localType = type;
	}

	public String showImage(boolean type) {
		if (localType){
			image = new RealSubject(imageURL);
			return image.showImage(type);
		}
		else {
			image = new Proxy(imageURL,type);
			return image.showImage(type);
		}
	}
}


package images;

public class RealSubject implements Image {
	String imageURL;
	String type; 

	public RealSubject(String url) {
		this.imageURL = url; 
		loadImage();
	}	
	
	private String loadImage() {
		return("Loading  " + imageURL);
	}

	/* (non-Javadoc)
	 * @see images.Image#showImage()
	 */
	@Override
	public String showImage(boolean type) {
		if (type) {
			return("Displaying  " + imageURL);}
		else {return("error  " + imageURL);}
		}
		
	}


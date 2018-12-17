public class ImageFile {
	private String fileName;
	private Image image;	// = null

	public ImageFile(String fileName) {
		this.fileName = fileName;
		// do not instantiate the image
	}

	public Image getImage() {
		if (image == null) { // lazy instantiate the image
			image = new Image(); 
		}
		return image;
	}
}

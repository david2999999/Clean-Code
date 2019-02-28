public class Image {

	public void drawWithPaintBrush() {
		PaintBrush brush = new PaintBrush() {	// avoid anonymous classes.
			@Override
			public void draw() {
				String color = "red";
				System.out.print("Drawing with " + color + " brush");
			}			
		};
		
		brush.draw();
	}
	
	public void drawWithBrush() {
		// create a class that implements the PaintBrush interface
		Brush brush = new Brush("red");	
		brush.draw();
	}
	
}



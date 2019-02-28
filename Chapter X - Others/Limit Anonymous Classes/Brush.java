public class Brush implements PaintBrush{
	String color;
	
	public Brush(String color) {
		this.color = color;
	}
	
	@Override
	public void draw() {
		System.out.print("Drawing with " + color + " brush");
	}
}



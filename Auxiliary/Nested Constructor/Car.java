public class Car {
	private int wheels;
	private int windows;
	private String color;
	
	
	public Car(String color) {
		this(4, 6, color);
	}
	
	public Car(int wheels, int windows, String color) {
		this.wheels = wheels;
		this.windows = windows;
		this.color = color;
	}
}


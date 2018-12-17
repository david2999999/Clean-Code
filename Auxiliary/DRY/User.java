public class User {
	private String name;

	public User() {
		this("Guest");
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public void eatBreakfast() {
		System.out.println("Setting up breakfast table");
		eatAndCleanUp();
	}
	
	public void eatDinner() {
		System.out.println("Setting up dinner table");
		eatAndCleanUp();
	}
	
	public void eatLunch() {
		System.out.println("Setting up lunch table");
		eatAndCleanUp();
	}
	
	// create a new method for DRY principle
	public void eatAndCleanUp() {
		System.out.println("Pick up fork");
		System.out.println("eat");
		System.out.println("clean up");
	}
}
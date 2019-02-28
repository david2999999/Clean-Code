public class User {
	private String name;

	public User() {
		this("Guest");
	}
	
	public User(String name) {
		this.name = name;
	}
	

	public void eatAt(String timeOfTheDay) {	
		if (timeOfTheDay.equalsIgnoreCase("dinner")  
				|| timeOfTheDay.equalsIgnoreCase("lunch")
				|| timeOfTheDay.equalsIgnoreCase("breakfast"))  {
			System.out.println("Setting up" + timeOfTheDay + "table");
			System.out.println("Pick up fork");
			System.out.println("eat");
			System.out.println("clean up");
		} else {
			System.out.println("Unknown time of day");
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
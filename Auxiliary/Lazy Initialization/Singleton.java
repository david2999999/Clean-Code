public class Singleton {
	public static Singleton instance;
	
	public static Singleton instance() {
		if (instance == null) { // lazy instantiation
			instance = new Singleton();
		}	
		return instance;
	}
}



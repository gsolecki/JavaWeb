
public class MySingleton {
	
	private static MySingleton instance = null;
	
	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	public void introduceYourself() {
		System.out.println("Hello. I am " + this.hashCode());
	}
	
}

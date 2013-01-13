
public class BeanFactory {

	public Object getBean(String name) {
	
		if (name.equals("myBean")) {
			return MySingleton.getInstance();
		}
		
		return null;
	}
}


public class MyMain {

	public static void main(String[] args) {
		
		BeanFactory bf = new BeanFactory();
		
		MySingleton myBean1 = (MySingleton) bf.getBean("myBean");
		myBean1.introduceYourself();

		MySingleton myBean2 = (MySingleton) bf.getBean("myBean");
		myBean2.introduceYourself();

	}
}

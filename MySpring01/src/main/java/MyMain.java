import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyMain {

	public static void main(String[] args) {
		
		BeanFactory bf = new ClassPathXmlApplicationContext("context.xml");
		
		MySingleton myBean1 = (MySingleton) bf.getBean("myBean");
		myBean1.introduceYourself();

		MySingleton myBean2 = (MySingleton) bf.getBean("myBean");
		myBean2.introduceYourself();

	}
}

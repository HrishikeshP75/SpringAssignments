package assign1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("sprass.xml");
		 Address address=(Address) context.getBean("address");
		 Customer customer=(Customer) context.getBean("customer");
		 customer.displayInfo();
		 address.displayAddress();
		 //System.out.println(address);
		 //System.out.println(customer);

	}

}

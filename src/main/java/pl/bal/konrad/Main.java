package pl.bal.konrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CustomerRepository customerRepository = context.getBean("customerRepository", CustomerRepository.class);
		
		Customer c1 = new Customer("Janek");
		Customer c2  = new Customer(null);
		
		try {
			customerRepository.addCustomer(c1);
			customerRepository.addCustomer(c2);
		} catch (Exception e) {
		}
		
		
		
	}

}

package pl.bal.konrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		SomeBean bean = context.getBean("someBean", SomeBean.class);
		bean.someMethod("111");
		bean.someMethod("222");
		
	}

}

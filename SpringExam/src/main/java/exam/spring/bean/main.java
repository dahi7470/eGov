package exam.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		 ApplicationContext con =
		 new ClassPathXmlApplicationContext(
		 "bean-config.xml");
		 AndroidPhone phone1 = (AndroidPhone) con.getBean("androidPhone");
		 phone1.run();
		 }
}

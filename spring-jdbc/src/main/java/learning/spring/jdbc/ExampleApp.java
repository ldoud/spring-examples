package learning.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleApp {
	
	public static void main(String[] args) {
	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("beans.xml");
	      
	      ClientDAO dao = (ClientDAO) context.getBean("clientDAO");
	      
	      int idForFirstClient = dao.create("My very first client");
	      int idForSecondClient = dao.create("Small business client");
	}
}

package learning.spring.jdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
	              new ClassPathXmlApplicationContext("beans.xml");
	      
	      ClientDAO dao = (ClientDAO) context.getBean("clientDAO");
	      
	      printNumberOfSmallBusinessClients(dao);
	      
	      int idForFirstClient = dao.create("Small business 1");
	      printNumberOfSmallBusinessClients(dao);
	      
	      int idForSecondClient = dao.create("Small business 2");
	      printNumberOfSmallBusinessClients(dao);
	      
	      Client firstClient = dao.findById(idForFirstClient);
	      firstClient.setName("Big business 1");
	      dao.update(firstClient);
	      printNumberOfSmallBusinessClients(dao);
	      
	      dao.delete(idForSecondClient);
	      printNumberOfSmallBusinessClients(dao);
	      
	      context.close();
	}

	private static void printNumberOfSmallBusinessClients(ClientDAO dao) {
		System.out.println("Number of small business clients: " + dao.findClientsByName("Small%").size());
	}
	
	
}

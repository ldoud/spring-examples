package learning.spring.jdbc;

import javax.sql.DataSource;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DatabaseConnectionTest {
	
	private static ClassPathXmlApplicationContext ctx;
	
	@Test
	public void queryTable() {
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		
		JdbcTemplate sqlTemplate = new JdbcTemplate(ds);
		int count = sqlTemplate.queryForObject("select count(1) from client", Integer.class);
		
		Assert.assertEquals("Should be zero rows", 0, count);
	}

	@BeforeClass
	public static void loadApplicationContext() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	@AfterClass
	public static void closeApplicationContext() {
		ctx.close();
	}
}

package learning.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ClientH2 implements ClientDAO {
	
	private JdbcTemplate sqlTemplate;

	public void setDataSource(DataSource database) {
		// TODO Auto-generated method stub

	}

	public int create(String clientName) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Client findById(int clientId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Client> findClientsByName(String clientNamePattern) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Client updatedInfo) {
		// TODO Auto-generated method stub

	}

	public void delete(int clientId) {
		// TODO Auto-generated method stub

	}

}

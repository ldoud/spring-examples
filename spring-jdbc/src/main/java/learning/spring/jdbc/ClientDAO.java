package learning.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

/**
 * Enable CRUD operations for client information.
 */
public interface ClientDAO {

	/**
	 * Use this database for all CRUD operations.
	 * @param database Non-null
	 */
	void setDataSource(DataSource database);
	
	/**
	 * Create new client in the database.
	 * @param newInfo All fields but the id are used to create the new client record.
	 * @return The id of the client.
	 */
	int create(Client newInfo);
	
	/**
	 * Search for clients based on their name.
	 * @param clientNamePattern May contain wild card patterns.
	 * @return Non-null list containing zero or more clients.
	 */
	List<Client> findClientsByName(String clientNamePattern);
	
	/**
	 * Update a client record in the database.
	 * @param updatedInfo All client information to be persisted.
	 */
	void update(Client updatedInfo);
	
	/**
	 * Delete a client's record from the database.
	 * @param clientId If this client doesn't exist no error is generated.
	 */
	void delete(int clientId);
}

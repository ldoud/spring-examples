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
	 * @param clientName Name of the new client.
	 * @return The id of the client.
	 */
	int create(String clientName);
	
	/**
	 * Find a client given it's id.
	 * @param clientId Primary key of client.
	 * @return Null if client isn't found.
	 */
	Client findById(int clientId);
	
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

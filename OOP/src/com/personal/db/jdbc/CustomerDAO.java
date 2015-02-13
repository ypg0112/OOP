package com.personal.db.jdbc;

//Data Access Object - for CRUD (create, read, update and delete)
public interface CustomerDAO {

	int createCustomer(CustomerDB customer); 
	CustomerDB getCustomer(int customerId);
	int deleteCustomer(int customerId);
	int updateCustomer(CustomerDB customer);
}

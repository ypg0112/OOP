package com.personal.db.jdbc;

public class MockCustomerDAOImpl implements CustomerDAO {

	@Override
	public int createCustomer(CustomerDB customer) {
		return 1;
	}

	@Override
	public CustomerDB getCustomer(int customerId) {
		return CustomerDB.builder().withId(0).withFirstName("").build();
	}

	@Override
	public int deleteCustomer(int customerId) {
		return 1;
	}

	@Override
	public int updateCustomer(CustomerDB customer) {
		return 1;
	}

}

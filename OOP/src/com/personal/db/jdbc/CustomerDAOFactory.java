package com.personal.db.jdbc;

public class CustomerDAOFactory {

	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}
}

package com.personal.db.jdbc;

public class CustomerDAODriver {

	public static void main(String[] args) {

		CustomerDAO dao = CustomerDAOFactory.getCustomerDAO();
		CustomerDB customer = dao.getCustomer(1);
		
		print(customer);
	}
	
	private static void print(CustomerDB db) {
		System.out.println(db.getId()+ " " + db.getFirstName() + " " + db.getLastName() + " " + db.getEmail() + " " + db.getPhone() );
	}

}

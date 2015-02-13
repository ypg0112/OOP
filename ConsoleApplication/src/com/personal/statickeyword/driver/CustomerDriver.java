package com.personal.statickeyword.driver;

import com.personal.object.creation.Product;
import com.personal.statickeyword.Customer;
import com.personal.statickeyword.ObjectLevelBlockCustomer;
import com.personal.statickeyword.StaticBlockCustomer;

public class CustomerDriver {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		System.out.println(Customer.getInstanceCount());
		System.out.println(customer1.getInstanceCount());
		
		StaticBlockCustomer c1 = new StaticBlockCustomer();
		StaticBlockCustomer c2 = new StaticBlockCustomer();
		StaticBlockCustomer c3 = new StaticBlockCustomer();
		
		System.out.println(StaticBlockCustomer.getInstanceCount());


		ObjectLevelBlockCustomer ob1 = new ObjectLevelBlockCustomer();
		ObjectLevelBlockCustomer ob2 = new ObjectLevelBlockCustomer(1, "test");
	}

}

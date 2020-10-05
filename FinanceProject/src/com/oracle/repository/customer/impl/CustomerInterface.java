package com.oracle.repository.customer.impl;

import com.oracle.model.user.Customer;

public interface CustomerInterface {
	
	public int newCustomer(Customer customer);
	
	public Customer getCustomerByApplicationId(String applicationId);
	
	public Customer getCustomerByCustomerId(String customerId);

	

}
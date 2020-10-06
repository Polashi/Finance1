package com.oracle.service.customer.impl;

import com.oracle.model.customer.Customer;

public interface CustomerServiceInterface {

	public Customer addNewCustomer(String customerDataInJson);

	public Customer getCustomerByCustomerId(String customerId);

	public Customer getCustomerByApplicationId(String applicationId);

}

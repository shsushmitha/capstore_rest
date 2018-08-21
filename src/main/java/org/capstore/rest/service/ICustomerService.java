package org.capstore.rest.service;

import java.util.List;

import org.capstore.rest.model.Customer;

public interface ICustomerService {

	public List<Customer> getAllCustomerEmail();
	
	Customer findOne(Integer customerId);

	List<Customer> getAllCustomer();
	public List<Customer> getAllCustomers();


}

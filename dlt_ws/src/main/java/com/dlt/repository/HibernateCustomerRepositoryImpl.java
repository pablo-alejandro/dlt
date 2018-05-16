package com.dlt.repository;

import java.util.ArrayList;
import java.util.List;

import com.dlt.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.dlt.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setFirstName("Pablo");
		customer.setLastName("Alejandro");
		
		customers.add(customer);
		
		return customers;
	}
}

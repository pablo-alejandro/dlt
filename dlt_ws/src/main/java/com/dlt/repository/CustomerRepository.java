package com.dlt.repository;

import java.util.List;

import com.dlt.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}
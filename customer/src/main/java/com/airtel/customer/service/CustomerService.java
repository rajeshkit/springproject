package com.airtel.customer.service;

import java.util.List;

import com.airtel.customer.model.Customer;

public interface CustomerService {
            public List<Customer> getAllCustomers();
			public Customer postCustomer(Customer customer);
			public Customer putCustomer(Customer customer);
			public Customer getCustomerById(int customerId);
			public String deleteCustomerById(int customerId);
}

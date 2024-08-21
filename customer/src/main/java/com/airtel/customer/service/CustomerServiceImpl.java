package com.airtel.customer.service;

import java.util.List;

import com.airtel.customer.model.Customer;

public class CustomerServiceImpl implements CustomerService{

    @Override
    public List<Customer> getAllCustomers() {
        // repsoitory getAllCustomers
        throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
    }

    @Override
    public Customer postCustomer(Customer customer) {
        // same customer need to pass it to repo
        throw new UnsupportedOperationException("Unimplemented method 'postCustomer'");
    }

    @Override
    public Customer putCustomer(Customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putCustomer'");
    }

    @Override
    public Customer getCustomerById(int customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
    }

    @Override
    public String deleteCustomerById(int customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteCustomerById'");
    }

}

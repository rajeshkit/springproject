package com.airtel.customer.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.airtel.customer.model.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class CustomerController {
    List<Customer> list=new ArrayList<>();
    public CustomerController(){
        Customer c1=new Customer(354,"Raki","Chennai","raki.kit@gmail.com");
        Customer c2=new Customer(334,"sds","Chennai","raki.kit@gmail.com");
        Customer c3=new Customer(6767,"Rsds","Chennai","raki.kit@gmail.com");
        Customer c4=new Customer(676,"fgfg","Chennai","raki.kit@gmail.com");
        list.add(c1);list.add(c2);list.add(c3);list.add(c4);
    }
   @GetMapping("/customer")    
    public List<Customer> getAllCustomers(){
        // talk to servie getAllcustomers
        return list;
    }
    @PostMapping("/customer")
    public Customer postCustomer(@RequestBody Customer customer) {
       // pass this customer to postCustomer
        return customer;
    }
    @PutMapping("/customer")
    public Customer putCustomer(@RequestBody Customer customer) {
        for (Customer customer1 : list) {
            if(customer1.getId()==customer.getId()){
                list.remove(customer1);
                list.add(customer);
                return customer;
            }
        }
        
        return null;
    }
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable("id") int customerId) {

        return list.stream().filter(e->e.getId()==customerId).findAny().orElse(null);
    }
    
    @DeleteMapping("/customer/{id}")
    public String deleteCustomerById(@PathVariable("id") int customerId){
        for (Customer customer : list) {
            if(customer.getId()==customerId){
                list.remove(customer);
                return "Customer removed successfully";
            }
        }    
        return "Customer is not removed";
    }
    
}
   
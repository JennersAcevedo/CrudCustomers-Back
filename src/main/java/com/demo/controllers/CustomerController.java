package com.demo.controllers;

import com.demo.model.Address;
import com.demo.model.Customer;
import com.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerbyId(@PathVariable Long id){
        return customerService.getCustomerbyId(id);
    }

    @PostMapping("/add")
    public Customer addCustomer(@RequestBody Customer customerBody){
        return customerService.addCustomer(customerBody);
    }

    @PostMapping("/add/address")
    public Address addAddress(@RequestBody Address addressBody){
        return customerService.addAddress(addressBody);
    }
        @DeleteMapping("/{id}/address")
        public void deleteAddress(@PathVariable Long id){
            customerService.deleteAddress(id);
        }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}

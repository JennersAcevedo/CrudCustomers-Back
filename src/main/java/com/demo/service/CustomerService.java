package com.demo.service;


import com.demo.model.Address;
import com.demo.model.Customer;
import com.demo.repo.AddressRepository;
import com.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private AddressRepository addressRepository;

    public List<Customer> getAllCustomers(){
return customerRepository.findAll();
    }

    public Customer getCustomerbyId(Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer != null) {
            List<Address> addresses = addressRepository.findByReferenceIdAndReferenceType(id, 70);
            customer.setAddresses(addresses);
        }
        return customer;
    }

    public Customer addCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }

    public Address addAddress( Address addresssBody){
        return addressRepository.save(addresssBody);
    }
    public void deleteAddress(Long id){
        addressRepository.deleteById(id);
    }
}

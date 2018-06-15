package com.vrs.videorental.application.register;

import com.vrs.videorental.domain.register.Customer;
import com.vrs.videorental.domain.register.CustomerRepository;

public class CustomerRegisterInteractor {


    private CustomerRepository repository;

    public CustomerRegisterInteractor(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerRepository getRepository() {
        return repository;
    }

    public void registerCustomer(String name, int code, String dateOfBirth) {
        Customer customer = new Customer(code, name, dateOfBirth);
        getRepository().save(customer);
    }


}

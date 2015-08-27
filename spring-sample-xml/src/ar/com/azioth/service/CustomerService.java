package ar.com.azioth.service;

import ar.com.azioth.model.Customer;

import java.util.List;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 */
public interface CustomerService {
    List<Customer> findAll();
}

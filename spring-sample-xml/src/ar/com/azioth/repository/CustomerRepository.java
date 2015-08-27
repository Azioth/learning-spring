package ar.com.azioth.repository;

import ar.com.azioth.model.Customer;

import java.util.List;

/**
 * Created by Sabastian Sandri on 27/08/2015.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}

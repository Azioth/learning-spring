package ar.com.azioth.repository;

import ar.com.azioth.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sabastian Sandri on 27/08/2015.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstName("Sebastian");
        customer.setLastName("Sandri");

        customers.add(customer);

        return customers;
    }
}

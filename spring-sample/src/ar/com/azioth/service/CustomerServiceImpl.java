package ar.com.azioth.service;

import ar.com.azioth.model.Customer;
import ar.com.azioth.repository.CustomerRepository;
import ar.com.azioth.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

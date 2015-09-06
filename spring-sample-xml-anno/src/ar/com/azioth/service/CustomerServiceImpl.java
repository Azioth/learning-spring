package ar.com.azioth.service;

import ar.com.azioth.model.Customer;
import ar.com.azioth.repository.CustomerRepository;
import ar.com.azioth.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Sebastian Sandri on 27/08/2015.
 * 
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

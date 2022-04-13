package ivansimeonov.springframework.msscbrewery.services;

import ivansimeonov.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto addNewCustomer(CustomerDto customerDto);

    void updateCustomerById(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}

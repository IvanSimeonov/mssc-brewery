package ivansimeonov.springframework.msscbrewery.services;

import ivansimeonov.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("John Doe")
                .build();
    }

    @Override
    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomerById(UUID customerId, CustomerDto customerDto) {
        // TODO: 13.04.22 Implement the method
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        // TODO: 13.04.22 Implement the method
        log.info("Deleting customer with id " + customerId);
    }
}

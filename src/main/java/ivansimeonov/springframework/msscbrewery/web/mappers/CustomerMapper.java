package ivansimeonov.springframework.msscbrewery.web.mappers;

import ivansimeonov.springframework.msscbrewery.domain.Customer;
import ivansimeonov.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @Author ivansimeonov
 * @Date 20.04.22
 */
@Mapper
public interface CustomerMapper {
    CustomerDto customerDtoToCustomer();

    Customer customerToCustomerDto();
}

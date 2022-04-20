package ivansimeonov.springframework.msscbrewery.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @Author ivansimeonov
 * @Date 20.04.22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private UUID customerId;
    private String name;
}

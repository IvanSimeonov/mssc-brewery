package ivansimeonov.springframework.msscbrewery.domain;

import ivansimeonov.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}

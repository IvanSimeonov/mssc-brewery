package ivansimeonov.springframework.msscbrewery.web.mappers;

import ivansimeonov.springframework.msscbrewery.domain.Beer;
import ivansimeonov.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @Author ivansimeonov
 * @Date 20.04.22
 */
@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}

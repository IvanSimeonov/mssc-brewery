package ivansimeonov.springframework.msscbrewery.services;

import ivansimeonov.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Heineken")
                .beerStyle("Pale ALe")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        log.info("Saving a new beer");
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        // TODO: 13.04.22  implement method 
    }

    @Override
    public void deleteBeer(UUID beerId) {
        // TODO: 13.04.22 implement method
        log.debug("Deleting a beer with id " + beerId);
        log.info("Deleting a beer with id " + beerId);
    }
}

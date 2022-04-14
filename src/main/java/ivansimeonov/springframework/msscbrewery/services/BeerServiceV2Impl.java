package ivansimeonov.springframework.msscbrewery.services;

import ivansimeonov.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import ivansimeonov.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Heineken")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        log.info("Saving a new beer");
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        // TODO: 13.04.22  implement method
    }

    @Override
    public void deleteBeer(UUID beerId) {
        // TODO: 13.04.22 implement method
        log.debug("Deleting a beer with id " + beerId);
        log.info("Deleting a beer with id " + beerId);
    }
}

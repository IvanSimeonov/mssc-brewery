package ivansimeonov.springframework.msscbrewery.web.controller.v2;

import ivansimeonov.springframework.msscbrewery.services.BeerServiceV2;
import ivansimeonov.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerServiceV2 beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> handlePost(@Valid @NotNull @RequestBody BeerDtoV2 beerDto) {
        log.debug("In handle post...");
        val savedDto = beerService.saveNewBeer(beerDto);
        val headers = new HttpHeaders();
        // TODO: 12.04.22 Add Hostname URL
        headers.add("Location", "/api/v1/beer" + savedDto.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity<BeerDtoV2> handleUpdate(@PathVariable("beerId") UUID beerId, @Valid @RequestBody BeerDtoV2 beerDto) {
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId) {
        beerService.deleteBeer(beerId);
    }

}

package com.zhangmagle.beerservice.web.controller;

import com.zhangmagle.beerservice.domain.BeerDto;
import com.zhangmagle.beerservice.service.BeerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/beer/")
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId")UUID beerId) {
        BeerDto beerDto = beerService.getBeerById(beerId);
        return new ResponseEntity<>(beerDto, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity saveBeer(@RequestBody BeerDto beerDto) {
        log.info("save beer" + beerDto.getName());
        beerService.saveBeer(beerDto);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId,
                                     @RequestBody BeerDto beerDto) {
        log.info("update beer with id:" + beerId);
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}

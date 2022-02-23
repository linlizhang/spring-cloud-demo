package com.zhangmagle.brewery.web.controller;

import com.zhangmagle.brewery.service.BeerService;
import com.zhangmagle.brewery.web.model.BeerDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
@AllArgsConstructor
public class BeerController {

    private BeerService beerService;

    @RequestMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId) {

        BeerDto beerDto = beerService.getBeer(beerId);
        return new ResponseEntity<>(beerDto, HttpStatus.OK);
    }
}

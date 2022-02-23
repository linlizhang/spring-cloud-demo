package com.zhangmagle.beerservice.service;

import com.zhangmagle.beerservice.domain.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return null;
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return null;
    }

    @Override
    public BeerDto updateBeer(UUID id, BeerDto beerDto) {
        return null;
    }
}

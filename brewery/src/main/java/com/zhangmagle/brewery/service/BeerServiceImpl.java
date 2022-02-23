package com.zhangmagle.brewery.service;

import com.zhangmagle.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeer(UUID id) {
        return BeerDto.builder()
                .id(id)
                .style("peer")
                .build();
    }
}

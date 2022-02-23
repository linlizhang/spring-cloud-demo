package com.zhangmagle.brewery.service;

import com.zhangmagle.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeer(UUID id);
}

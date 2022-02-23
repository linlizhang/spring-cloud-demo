package com.zhangmagle.beerservice.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class BeerDto {

    private UUID id;

    private String name;

    private String style;

    private BigDecimal upc;
}

package com.zhangmagle.brewery.web.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class BeerDto {

    private UUID id;

    private String style;

    private String name;

}

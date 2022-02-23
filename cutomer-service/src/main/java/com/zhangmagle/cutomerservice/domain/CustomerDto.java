package com.zhangmagle.cutomerservice.domain;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CustomerDto {

    private UUID id;

    private String name;
}

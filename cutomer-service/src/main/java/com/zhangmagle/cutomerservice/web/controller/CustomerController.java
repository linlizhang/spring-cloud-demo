package com.zhangmagle.cutomerservice.web.controller;

import com.zhangmagle.cutomerservice.domain.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId) {
        return new ResponseEntity<>(CustomerDto.builder()
                .id(customerId).build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDto customerDto) {
        log.info("create a brand new customer: " + customerDto.getId());
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@PathVariable("customerId") UUID customerId,
                                         @RequestBody CustomerDto customerDto) {
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}

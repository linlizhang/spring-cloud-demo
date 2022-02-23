package com.zhangmagle.cutomerservice.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhangmagle.cutomerservice.domain.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@WebMvcTest
public class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void createCustomerShouldReturnAccepted() throws Exception {
        CustomerDto customerDto = CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("new customer")
                .build();

        this.mockMvc.perform(post("/api/v1/customer/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(customerDto)))
                .andExpect(MockMvcResultMatchers.status().isAccepted());
    }
}

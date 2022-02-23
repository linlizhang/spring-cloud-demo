package com.zhangmagle.beerservice.web.controller;

import com.zhangmagle.beerservice.service.BeerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest
public class BeerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BeerService beerService;

    @Test
    public void shouldReturnOK() throws Exception {

        this.mockMvc.perform(get("/api/v1/beer/" + UUID.randomUUID()))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

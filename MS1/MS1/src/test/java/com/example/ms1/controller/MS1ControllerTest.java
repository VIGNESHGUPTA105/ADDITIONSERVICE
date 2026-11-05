package com.example.ms1.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.ms1.service.ArithmeticService;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(MS1Controller.class)
class MS1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ArithmeticService arithmeticService;

    @Test
    void testAddition() throws Exception {
        when(arithmeticService.add(5, 10)).thenReturn(15);

        mockMvc.perform(get("/ms1/add")
                .param("a", "5")
                .param("b", "10"))
            .andExpect(status().isOk())
            .andExpect(content().string("MS 1.1 - Additon = 15"));
    }
}

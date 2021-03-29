package com.laurentiuspilca.springtesting;

import com.laurentiuspilca.springtesting.repositories.ProductRepository;
import com.laurentiuspilca.springtesting.services.ProductService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringTestingApplicationIntegrationTests {

	@Autowired
	private ProductService service;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getProductTest() throws Exception{
			mockMvc.perform(
					get("/product/{name}", "testproduct1")
			)
			.andExpect(status().isOk())
			.andExpect(jsonPath("$.name").value("testproduct1"))
			.andExpect(jsonPath("$.price").value(10D));
	}
}

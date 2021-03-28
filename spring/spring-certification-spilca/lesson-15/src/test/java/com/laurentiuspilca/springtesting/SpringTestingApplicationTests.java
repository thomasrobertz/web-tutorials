package com.laurentiuspilca.springtesting;

import com.laurentiuspilca.springtesting.repositories.ProductRepository;
import com.laurentiuspilca.springtesting.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
class SpringTestingApplicationTests {

	@Autowired
	private ProductService service;

	@MockBean
	private ProductRepository mockRepo;

	@Test
	void noProductsReturnedTest() {
		given(mockRepo.getProductNames()).willReturn(Collections.emptyList());
		List<String> result = service.getProductNamesWithEvenNumberOfCharacters();
		assertTrue(result.isEmpty());
	}

	@Test
	void moreProductsAreFound() {
		List<String> input = List.of("aa", "bbb", "cccc");
		given(mockRepo.getProductNames()).willReturn(input);
		List<String> result = service.getProductNamesWithEvenNumberOfCharacters();
		assertEquals(2, result.size());

		verify(mockRepo, times(2)).addProduct(any());
	}

	@Test
	void integrationTestEvenNumberProductNames() {
		//List<String> result = service.getProductNamesWithEvenNumberOfCharacters();
		//assertEquals(2, result.size());
	}
}

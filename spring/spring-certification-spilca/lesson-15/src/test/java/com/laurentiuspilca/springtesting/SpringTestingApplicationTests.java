package com.laurentiuspilca.springtesting;

import com.laurentiuspilca.springtesting.repositories.ProductRepository;
import com.laurentiuspilca.springtesting.services.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;

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

}

package br.com.edea.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UdemySpringBootApplicationTests {
	
	@Value("${pagination.itensPerPage}")
	private int itensPerPage;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testLoadTestContext() {
		assertEquals(100, itensPerPage);
	}

}

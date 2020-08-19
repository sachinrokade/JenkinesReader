package com.jenkiens.JenkinesReader;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jenkiens.controller.JekinesControler;

@SpringBootTest
public class JenkinesReaderControllerTests extends AbstractTestNGSpringContextTests {

	@Autowired
	private JekinesControler controllerTest;// =new JekinesControler();

	private MockMvc mockMvc;

	@BeforeClass
	public void test() {

		mockMvc = MockMvcBuilders.standaloneSetup(controllerTest).build();
	}

	@Test
	public void contexLoads() throws Exception {
		assertNotNull(controllerTest);
	}

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
	}
	@Test
	public void shouldReturnDefault() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/"))
		.andExpect(MockMvcResultMatchers.content().string("high")).andReturn();
	}
	



}

// @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

// @LocalServerPort
// private int port;
//
// @Autowired
// private TestRestTemplate restTemplate;
//
// @Test
// public void greetingShouldReturnDefaultMessage() throws Exception {
// assertEquals("high",
// restTemplate.getForObject("http://localhost:" + port + "/",String.class));
// }

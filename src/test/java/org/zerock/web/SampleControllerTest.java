package org.zerock.web;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // spring MVC Test
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class SampleControllerTest {
	// spirng-test모듈을 통해서 별도의 WAS 구동 없이도 컨트롤러를 테스트하는 작업이 가능
	
	private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);
	
	@Inject
	private WebApplicationContext wac;
	
	private MockMvc mokMvc; // browser request/response 
	
	@Before
	public void setup() {
		this.mokMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("setup........");
	}
	
	@Test
	public void testDoA() throws Exception {
		mokMvc.perform(MockMvcRequestBuilders.get("/doA"));
	}
}

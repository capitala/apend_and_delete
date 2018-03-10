package org.chalenges.solutions.append_and_delete.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.chalenges.solutions.append_and_delete.service.SolutionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SolutionController.class)
public class SolutionControllerTest {
	@MockBean
	private SolutionService service;
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void checkConvertabilityTest() throws Exception {
		Mockito.when(service.getResults("hackerhappy", "hackerrank", 9)).thenReturn("Yes");
		mockMvc.perform(get("/checkConvertability?first=hackerhappy&second=hackerrank&alterations=9"))
				.andExpect(status().isOk()).andExpect(content().string("Yes"));
		
	}

}

package org.chalenges.solutions.append_and_delete.integrationTests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.chalenges.solutions.append_and_delete.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = App.class)
@AutoConfigureMockMvc
public class IntegrationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void checkConvertability() throws Exception {
		mockMvc.perform(get("/checkConvertability?first=hackerhappy&second=hackerrank&alterations=9"))
				.andExpect(status().isOk()).andExpect(content().string("Yes"));
	}

}

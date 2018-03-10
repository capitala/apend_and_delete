package org.chalenges.solutions.append_and_delete.service;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(SolutionService.class)
public class SolutionServiceTest {
	@Autowired
	private SolutionService service;

	@Test@Ignore
	public void getResultsTestCase1() {
		assertEquals(service.getResults("hackerhappy", "hackerrank", 9), "Yes");
	}

	@Test@Ignore
	public void getResultsTestCase2() {
		assertEquals(service.getResults("aba", "aba", 7), "Yes");
	}

	@Test@Ignore
	public void getResultsTestCase3() {
		assertEquals(service.getResults("abc", "aba", 7), "Yes");
	}

	@Test@Ignore
	public void getResultsTestCase4() {
		assertEquals(service.getResults("ashley", "ash", 2), "No");
	}

	@Test@Ignore
	public void getResultsTestCase5() {
		assertEquals(service.getResults("ashley", "ash", 5), "Yes");
	}

	@Test@Ignore
	public void getResultsTestCase6() {
		assertEquals(service.getResults("abc", "abc", 2), "Yes");
	}

	@Test@Ignore
	public void getResultsTestCase7() {
		assertEquals(service.getResults(
				"asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
				"asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv",
				20), "Yes");
	}
	
	@Test
	public void getResultsTestCase8() {
		assertEquals(service.getResults("qwerasdf", "qwerbsdf", 6), "No");
	}

}

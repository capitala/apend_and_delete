package org.chalenges.solutions.append_and_delete.controller;

import org.chalenges.solutions.append_and_delete.service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolutionController {
	@Autowired
	private SolutionService service;

	@RequestMapping("/checkConvertability")
	public String checkConvertability(@RequestParam("first") String first, @RequestParam("second") String second,
			@RequestParam("alterations") int k) {
		return service.getResults(first, second, k);
	}

}

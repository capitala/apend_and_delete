package org.chalenges.solutions.append_and_delete.service;

import org.springframework.stereotype.Service;

@Service
public class SolutionService {
	public String getResults(String firstString, String secondString, int k) {
		String bigger = firstString.length() > secondString.length() ? firstString : secondString;
		String smaller = firstString.length() <= secondString.length() ? firstString : secondString;
		int count = 0;
		for (int i = 0; i < smaller.length(); i++) {
			if (smaller.charAt(i) == bigger.charAt(i))
				count += 2;
			else 
				break;
		}

		 if (((firstString.length() + secondString.length() - count) == k)||((k-(firstString.length() + secondString.length() - count))%2 == 0)
				|| k >= (firstString.length() + secondString.length())||(count==(firstString.length() + secondString.length())&&k%2==0))
			return "Yes";
		else
			return "No";
	}
}

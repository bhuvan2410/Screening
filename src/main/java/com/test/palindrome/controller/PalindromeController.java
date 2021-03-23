package com.test.palindrome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.palindrome.PalindromeService;

@RestController
@RequestMapping("/palindrome")
public class PalindromeController {

	@Autowired
	private PalindromeService service;

	@GetMapping("/{input}")
	public ResponseEntity<String> findPalindrome(@PathVariable("input") String input) {
		return new ResponseEntity<String>(service.findLongestSubString(input), HttpStatus.OK);
	}

}

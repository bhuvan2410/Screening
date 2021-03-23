package com.test.palindrome.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/binary-reverse")
public class BinaryReversalController {

	@GetMapping("/{input}")
	public ResponseEntity<Integer> binaryReverse(@PathVariable("input") Integer input) {
		return new ResponseEntity<Integer>(reverseBinary(input), HttpStatus.OK);
	}

	private Integer reverseBinary(Integer input) {
		String paddedInput = String.format("%8s", Integer.toBinaryString(input)).replace(" ", "0");
		return Integer.parseInt(reverse(paddedInput), 2);
	}

	private String reverse(String input) {
		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		for (int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length - i - 1];

		return new String(result);
	}

}

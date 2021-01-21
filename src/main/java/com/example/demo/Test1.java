package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

    @GetMapping("/test1")
    @ResponseBody
    public ResponseEntity<String> test(@RequestParam(value = "str", required = false) String str) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "text/plain; charset=utf-8");
		headers.set("Location", "/test2?str=" + str);
		return new ResponseEntity<>("ok", headers, HttpStatus.TEMPORARY_REDIRECT);
	}

}
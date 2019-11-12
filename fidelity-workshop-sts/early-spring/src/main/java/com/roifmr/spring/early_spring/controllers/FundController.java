package com.roifmr.spring.early_spring.controllers;


import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roifmr.spring.early_spring.domain.Fund;

@RestController
@RequestMapping("fund")
public class FundController {
	
	@GetMapping(path = "sample",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSampleFund(){
		
		return new ResponseEntity<>( 
				new Fund("ForestRET", "lands of money", new BigDecimal("192.79")),
				HttpStatus.OK);
	}

	@GetMapping(path = "gensample/{fname}/{ivalue}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> generateSampleFund(
			@PathVariable("fname") String fundName,
			@PathVariable("ivalue") String initValue
			){
		Fund nueFund = new Fund(fundName, "generated sample fund", new BigDecimal(initValue));
		return new ResponseEntity<Object>( nueFund, HttpStatus.CREATED);
	}
	
	@PostMapping(path = "",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addFund(@RequestBody Fund rquestedFund){
		
			rquestedFund.setDescription("altered description " + UUID.randomUUID().toString());
		
		return new ResponseEntity<Object>(rquestedFund, HttpStatus.CREATED);
	}






}

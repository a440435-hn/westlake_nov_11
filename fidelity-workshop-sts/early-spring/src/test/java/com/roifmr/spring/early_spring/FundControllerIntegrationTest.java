package com.roifmr.spring.early_spring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.roifmr.spring.early_spring.controllers.FundController;
import com.roifmr.spring.early_spring.domain.Fund;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class FundControllerIntegrationTest {

	@Autowired
	private FundController currentController;
	
	
	@Test
	void sampleFundRequestReturnTest() {
		ResponseEntity<Object> rtnValue = 
				currentController.getSampleFund();
		
	 Fund rtnFund = (Fund)rtnValue.getBody();
	}

}

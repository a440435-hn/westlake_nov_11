package com.roifmr.spring.early_spring;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.roifmr.spring.early_spring.domain.Fund;


@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
class FundControllerTests {

	@Test
	void getSampleFundTest() {
		Fund rtnValue = 
		given()
		.accept(MediaType.APPLICATION_JSON_VALUE)
		.when()
		.get("/fund/sample")
		.then()
		.statusCode(HttpStatus.OK.value())
		.and()
		.extract().as(Fund.class);
		
		assertTrue(rtnValue.getCurrentValue().compareTo(BigDecimal.ZERO) == 1);
	}

}

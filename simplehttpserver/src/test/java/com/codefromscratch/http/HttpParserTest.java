package com.codefromscratch.http;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class HttpParserTest {

	private HttpParser httpParser;
	 
	@BeforeAll
	public void beforeClass() {
		httpParser = new HttpParser();
	}
	
	@Test
	void parseHttpRequest() {
		
	}

}

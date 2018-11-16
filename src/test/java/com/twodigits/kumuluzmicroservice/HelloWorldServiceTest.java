package com.twodigits.kumuluzmicroservice;

import static org.junit.Assert.*;
import org.junit.Test;

import com.twodigits.kumuluzmicroservice.HelloWorldService;

/**
 * JUnit test for HelloWorldService
 * @author robert.diers
 *
 */
public class HelloWorldServiceTest {

	@Test
    public void sayHello() {
		
		// HelloWorldService is tested
		HelloWorldService tester = new HelloWorldService();

        // assert statements
        assertEquals("return code must be 200", 200, tester.sayHello().getStatus()); 
    }
	
}
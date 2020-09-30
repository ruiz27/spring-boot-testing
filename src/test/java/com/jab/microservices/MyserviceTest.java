package com.jab.microservices;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class MyserviceTest {

	MyService myService;

	@Before
	public void init() {
		myService = Mockito.mock(MyService.class);

	}
	
	@Test
	public void when_greet_is_ok() {
		assertEquals("Hello, World", myService.greet());
	}
}

package org.jacoco.examples.maven.xtend

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class HelloWorldTest {

	private HelloWorld subject;

	@Before
	def void setup() {
		subject = new HelloWorld();
	}
	
	@Test
	def void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

}

package org.jacoco.examples.maven.scala

import org.junit._
import Assert._

@Test
class HelloWorldTest {

    @Test
    def testMessage() = {
    	assertEquals("Hello World!", HelloWorld.message(false))  
	}
}

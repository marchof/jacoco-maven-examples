package org.jacoco.examples.maven.kotlin

import org.junit.*
import kotlin.test.*

class HelloWorldTest {

	@Test fun testMessage() {
		expect("Hello World!") { HelloWorld().getMessage(false) }
	}

}

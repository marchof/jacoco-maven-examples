package org.jacoco.examples.maven.xtend

class HelloWorld {

	def String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}

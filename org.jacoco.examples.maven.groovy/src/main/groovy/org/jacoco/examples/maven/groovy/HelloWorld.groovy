package org.jacoco.examples.maven.groovy

class HelloWorld {

	String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}

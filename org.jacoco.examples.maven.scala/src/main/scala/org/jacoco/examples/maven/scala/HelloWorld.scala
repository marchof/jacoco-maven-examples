package org.jacoco.examples.maven.java

object HelloWorld {
  
	def message(bigger : Boolean) = {
		if (bigger) {
			"Hello Universe!";
		} else {
			"Hello World!";
		}
	}

}

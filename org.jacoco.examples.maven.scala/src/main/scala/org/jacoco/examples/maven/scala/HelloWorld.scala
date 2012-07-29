package org.jacoco.examples.maven.scala

object HelloWorld {
  
	def message(bigger : Boolean) = {
		if (bigger) {
			"Hello Universe!";
		} else {
			"Hello World!";
		}
	}

}

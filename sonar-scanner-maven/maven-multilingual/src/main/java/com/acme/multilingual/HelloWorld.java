/**
 * The {@code HelloWorld} class provides methods to print messages to the console.
 * It includes a method to print a greeting message and another method that is not covered by unit tests.
 */
package com.acme.multilingual;

import java.util.logging.Logger;

public class HelloWorld {

  private static final Logger LOGGER = Logger.getLogger(HelloWorld.class.getName());

  public void sayHello() {
    LOGGER.info("Hello World!");
  }

  void notCovered() {
    LOGGER.info("This method is not covered by unit tests");
  }

}

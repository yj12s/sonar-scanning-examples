package com.acme.multilingual;

import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {
    new HelloWorld().sayHello();
  }
  @Test
public void notCovered() {
  new HelloWorld().notCovered();
}

}

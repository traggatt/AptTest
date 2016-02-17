/**
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package aptProject;

/**
 * 
 */
public class Runner {

  public static void main(String[] args) {
    
    TestComponent component = DaggerTestComponent.create();
    System.out.println(component.getDep());
  }
  
}

/**
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package aptProject;

import dagger.Component;

/**
 * 
 */
@Component(modules = {TestModule.class})
public interface TestComponent {

  public TestDep getDep();
  
}

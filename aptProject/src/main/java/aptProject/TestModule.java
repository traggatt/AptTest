/**
 * Copyright (C) 2016 - present by OpenGamma Inc. and the OpenGamma group of companies
 * 
 * Please see distribution for license.
 */
package aptProject;

import dagger.Module;
import dagger.Provides;

/**
 * 
 */
@Module
public class TestModule {

  @Provides
  public TestDep provideTestDep() {
    return new TestDep();
  }
  
}

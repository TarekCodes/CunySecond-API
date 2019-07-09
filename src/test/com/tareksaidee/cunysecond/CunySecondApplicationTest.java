package com.tareksaidee.cunysecond;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class CunySecondApplicationTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CunySecondApplication */
  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final CunySecondApplication objectUnderTest = new CunySecondApplication();

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(SpringApplication.class)
  @Test
  public void mainInputNullOutputVoid() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(SpringApplication.class);

    // Arrange
    final String[] args = null;
    final Method runMethod = DTUMemberMatcher.method(SpringApplication.class, "run", Class.class,
                                                     java.lang.String[].class);
    PowerMockito.doReturn(null)
        .when(SpringApplication.class, runMethod)
        .withArguments(
            or(isA(Class.class), isNull(Class.class)),
            new Object[] {or(isA(java.lang.String[].class), isNull(java.lang.String[].class))});

    // Act
    CunySecondApplication.main(args);

    // Method returns void, testing that no exception is thrown
  }
}

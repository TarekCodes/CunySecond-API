package com.tareksaidee.cunysecond.config;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.google.common.base.Predicate;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

@RunWith(PowerMockRunner.class)
public class WebConfigTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: WebConfig */
  // Test written by Diffblue Cover.
  @PrepareForTest(WebConfig.class)
  @Test
  public void apiInfoOutputNotNull()
      throws Exception, InvocationTargetException, IllegalAccessException, NoSuchMethodException {

    // Arrange
    final WebConfig objectUnderTest = new WebConfig();
    final ApiInfo apiInfo = PowerMockito.mock(ApiInfo.class);
    PowerMockito.whenNew(ApiInfo.class)
        .withParameterTypes(String.class, String.class, String.class, String.class, Contact.class,
                            String.class, String.class, Collection.class)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(Contact.class), isNull(Contact.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(Collection.class), isNull(Collection.class)))
        .thenReturn(apiInfo);
    final Contact contact = PowerMockito.mock(Contact.class);
    PowerMockito.whenNew(Contact.class)
        .withParameterTypes(String.class, String.class, String.class)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(contact);

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.tareksaidee.cunysecond.config.WebConfig");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("apiInfo");
    methodUnderTest.setAccessible(true);
    final ApiInfo actual = (ApiInfo)methodUnderTest.invoke(objectUnderTest);

    // Assert result
    Assert.assertNotNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({ApiSelectorBuilder.class, RequestHandlerSelectors.class, Docket.class,
                   WebConfig.class})
  @Test
  public void
  apiOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(RequestHandlerSelectors.class);

    // Arrange
    final WebConfig objectUnderTest = new WebConfig();
    final ApiInfo apiInfo = PowerMockito.mock(ApiInfo.class);
    PowerMockito.whenNew(ApiInfo.class)
        .withParameterTypes(String.class, String.class, String.class, String.class, Contact.class,
                            String.class, String.class, Collection.class)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(Contact.class), isNull(Contact.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(Collection.class), isNull(Collection.class)))
        .thenReturn(apiInfo);
    final Contact contact = PowerMockito.mock(Contact.class);
    PowerMockito.whenNew(Contact.class)
        .withParameterTypes(String.class, String.class, String.class)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)))
        .thenReturn(contact);
    final Docket docket = PowerMockito.mock(Docket.class);
    final ApiSelectorBuilder apiSelectorBuilder = PowerMockito.mock(ApiSelectorBuilder.class);
    final ApiSelectorBuilder apiSelectorBuilder1 = PowerMockito.mock(ApiSelectorBuilder.class);
    final Docket docket1 = PowerMockito.mock(Docket.class);
    final Method apiInfoMethod = DTUMemberMatcher.method(Docket.class, "apiInfo", ApiInfo.class);
    PowerMockito.doReturn(null)
        .when(docket1, apiInfoMethod)
        .withArguments(or(isA(ApiInfo.class), isNull(ApiInfo.class)));
    final Method buildMethod = DTUMemberMatcher.method(ApiSelectorBuilder.class, "build");
    PowerMockito.doReturn(docket1).when(apiSelectorBuilder1, buildMethod).withNoArguments();
    final Method apisMethod =
        DTUMemberMatcher.method(ApiSelectorBuilder.class, "apis", Predicate.class);
    PowerMockito.doReturn(apiSelectorBuilder1)
        .when(apiSelectorBuilder, apisMethod)
        .withArguments(or(isA(Predicate.class), isNull(Predicate.class)));
    final Method selectMethod = DTUMemberMatcher.method(Docket.class, "select");
    PowerMockito.doReturn(apiSelectorBuilder).when(docket, selectMethod).withNoArguments();
    PowerMockito.whenNew(Docket.class)
        .withParameterTypes(DocumentationType.class)
        .withArguments(or(isA(DocumentationType.class), isNull(DocumentationType.class)))
        .thenReturn(docket);
    final Method basePackageMethod =
        DTUMemberMatcher.method(RequestHandlerSelectors.class, "basePackage", String.class);
    PowerMockito.doReturn(null)
        .when(RequestHandlerSelectors.class, basePackageMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final Docket actual = objectUnderTest.api();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final WebConfig objectUnderTest = new WebConfig();

    // Method returns void, testing that no exception is thrown
  }
}

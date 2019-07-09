package com.tareksaidee.cunysecond.controller;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.diffblue.deeptestutils.Reflector;
import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;

@RunWith(PowerMockRunner.class)
public class DataControllerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: DataController */
  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final DataController objectUnderTest = new DataController();

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({EntityUtils.class, HttpClients.class, CloseableHttpResponse.class,
                   DataController.class, CloseableHttpClient.class, URIBuilder.class})
  @Test
  public void
  getAllSchoolsOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(HttpClients.class);
    PowerMockito.mockStatic(EntityUtils.class);

    // Arrange
    final DataController objectUnderTest = new DataController();
    final HttpGet httpGet = PowerMockito.mock(HttpGet.class);
    PowerMockito.whenNew(HttpGet.class)
        .withParameterTypes(URI.class)
        .withArguments(or(isA(URI.class), isNull(URI.class)))
        .thenReturn(httpGet);
    final URIBuilder uRIBuilder = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder1 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder2 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder3 = PowerMockito.mock(URIBuilder.class);
    final Method buildMethod = DTUMemberMatcher.method(URIBuilder.class, "build");
    PowerMockito.doReturn(null).when(uRIBuilder3, buildMethod).withNoArguments();
    final Method setPathMethod = DTUMemberMatcher.method(URIBuilder.class, "setPath", String.class);
    PowerMockito.doReturn(uRIBuilder3)
        .when(uRIBuilder2, setPathMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method setHostMethod = DTUMemberMatcher.method(URIBuilder.class, "setHost", String.class);
    PowerMockito.doReturn(uRIBuilder2)
        .when(uRIBuilder1, setHostMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method setSchemeMethod =
        DTUMemberMatcher.method(URIBuilder.class, "setScheme", String.class);
    PowerMockito.doReturn(uRIBuilder1)
        .when(uRIBuilder, setSchemeMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    PowerMockito.whenNew(URIBuilder.class).withNoArguments().thenReturn(uRIBuilder);
    final Method toStringMethod =
        DTUMemberMatcher.method(EntityUtils.class, "toString", HttpEntity.class, String.class);
    PowerMockito.doReturn(null)
        .when(EntityUtils.class, toStringMethod)
        .withArguments(or(isA(HttpEntity.class), isNull(HttpEntity.class)),
                       or(isA(String.class), isNull(String.class)));
    final CloseableHttpClient closeableHttpClient = PowerMockito.mock(CloseableHttpClient.class);
    final CloseableHttpResponse closeableHttpResponse =
        PowerMockito.mock(CloseableHttpResponse.class);
    final Method getEntityMethod =
        DTUMemberMatcher.method(CloseableHttpResponse.class, "getEntity");
    PowerMockito.doReturn(null).when(closeableHttpResponse, getEntityMethod).withNoArguments();
    final Method executeMethod =
        DTUMemberMatcher.method(CloseableHttpClient.class, "execute", HttpUriRequest.class);
    PowerMockito.doReturn(closeableHttpResponse)
        .when(closeableHttpClient, executeMethod)
        .withArguments(or(isA(HttpUriRequest.class), isNull(HttpUriRequest.class)));
    PowerMockito.doReturn(closeableHttpClient).when(HttpClients.class);
    HttpClients.createDefault();

    // Act
    final String actual = objectUnderTest.getAllSchools();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOutputNotNull() throws InvocationTargetException, NoSuchMethodException,
                                            IllegalAccessException, InvocationTargetException {

    // Arrange
    final Class<?> schoolsType =
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController$Schools");
    final Method schoolsValueOf = schoolsType.getDeclaredMethod("valueOf", String.class);
    final Enum objectUnderTest = (Enum)schoolsValueOf.invoke(null, "CUNY_School_Of_Law");
    final Class<?> classUnderTest =
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController$Schools");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod("getName");
    methodUnderTest.setAccessible(true);

    // Act
    final String actual = (String)methodUnderTest.invoke(objectUnderTest);

    // Assert result
    Assert.assertEquals("school_of_law", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({EntityUtils.class, HttpClients.class, CloseableHttpResponse.class,
                   DataController.class, CloseableHttpClient.class, URIBuilder.class})
  @Test
  public void
  GetSchoolInfoInputNotNullOutputNull()
      throws Exception, InvocationTargetException, NoSuchMethodException, IllegalAccessException {

    // Setup mocks
    PowerMockito.mockStatic(HttpClients.class);
    PowerMockito.mockStatic(EntityUtils.class);

    // Arrange
    final DataController objectUnderTest = new DataController();
    final Class<?> schoolsType =
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController$Schools");
    final Method schoolsValueOf = schoolsType.getDeclaredMethod("valueOf", String.class);
    final Enum school = (Enum)schoolsValueOf.invoke(null, "CUNY_School_Of_Law");
    final HttpGet httpGet = PowerMockito.mock(HttpGet.class);
    PowerMockito.whenNew(HttpGet.class)
        .withParameterTypes(URI.class)
        .withArguments(or(isA(URI.class), isNull(URI.class)))
        .thenReturn(httpGet);
    final URIBuilder uRIBuilder = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder1 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder2 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder3 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder4 = PowerMockito.mock(URIBuilder.class);
    final URIBuilder uRIBuilder5 = PowerMockito.mock(URIBuilder.class);
    final Method buildMethod = DTUMemberMatcher.method(URIBuilder.class, "build");
    PowerMockito.doReturn(null).when(uRIBuilder5, buildMethod).withNoArguments();
    final Method setParameterMethod =
        DTUMemberMatcher.method(URIBuilder.class, "setParameter", String.class, String.class);
    PowerMockito.doReturn(uRIBuilder5)
        .when(uRIBuilder4, setParameterMethod)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)));
    final Method setParameterMethod1 =
        DTUMemberMatcher.method(URIBuilder.class, "setParameter", String.class, String.class);
    PowerMockito.doReturn(uRIBuilder4)
        .when(uRIBuilder3, setParameterMethod1)
        .withArguments(or(isA(String.class), isNull(String.class)),
                       or(isA(String.class), isNull(String.class)));
    final Method setPathMethod = DTUMemberMatcher.method(URIBuilder.class, "setPath", String.class);
    PowerMockito.doReturn(uRIBuilder3)
        .when(uRIBuilder2, setPathMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method setHostMethod = DTUMemberMatcher.method(URIBuilder.class, "setHost", String.class);
    PowerMockito.doReturn(uRIBuilder2)
        .when(uRIBuilder1, setHostMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    final Method setSchemeMethod =
        DTUMemberMatcher.method(URIBuilder.class, "setScheme", String.class);
    PowerMockito.doReturn(uRIBuilder1)
        .when(uRIBuilder, setSchemeMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    PowerMockito.whenNew(URIBuilder.class).withNoArguments().thenReturn(uRIBuilder);
    final Method toStringMethod =
        DTUMemberMatcher.method(EntityUtils.class, "toString", HttpEntity.class, String.class);
    PowerMockito.doReturn(null)
        .when(EntityUtils.class, toStringMethod)
        .withArguments(or(isA(HttpEntity.class), isNull(HttpEntity.class)),
                       or(isA(String.class), isNull(String.class)));
    final CloseableHttpClient closeableHttpClient = PowerMockito.mock(CloseableHttpClient.class);
    final CloseableHttpResponse closeableHttpResponse =
        PowerMockito.mock(CloseableHttpResponse.class);
    final Method getEntityMethod =
        DTUMemberMatcher.method(CloseableHttpResponse.class, "getEntity");
    PowerMockito.doReturn(null).when(closeableHttpResponse, getEntityMethod).withNoArguments();
    final Method executeMethod =
        DTUMemberMatcher.method(CloseableHttpClient.class, "execute", HttpUriRequest.class);
    PowerMockito.doReturn(closeableHttpResponse)
        .when(closeableHttpClient, executeMethod)
        .withArguments(or(isA(HttpUriRequest.class), isNull(HttpUriRequest.class)));
    PowerMockito.doReturn(closeableHttpClient).when(HttpClients.class);
    HttpClients.createDefault();

    // Act
    final Class<?> classUnderTest =
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController");
    final Method methodUnderTest = classUnderTest.getDeclaredMethod(
        "GetSchoolInfo",
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController$Schools"));
    methodUnderTest.setAccessible(true);
    final String actual = (String)methodUnderTest.invoke(objectUnderTest, school);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.tareksaidee.cunysecond.controller.DataController");

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void staticInitOutputVoid2() throws InvocationTargetException {

    // Act, using constructor to test static initializer
    final Object constructed =
        Reflector.getInstance("com.tareksaidee.cunysecond.controller.DataController$Schools");

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException2() throws Throwable {

    // Arrange
    final String name = null;
    final Class<?> classUnderTest =
        Reflector.forName("com.tareksaidee.cunysecond.controller.DataController$Schools");
    final Method methodUnderTest =
        classUnderTest.getDeclaredMethod("valueOf", Reflector.forName("java.lang.String"));
    methodUnderTest.setAccessible(true);
    try {
      thrown.expect(NullPointerException.class);

      // Act
      methodUnderTest.invoke(null, name);
    } catch (InvocationTargetException ex) {

      // Method is not expected to return due to exception thrown
      throw ex.getCause();
    }
  }
}

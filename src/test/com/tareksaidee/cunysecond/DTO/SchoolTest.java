package com.tareksaidee.cunysecond.DTO;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SchoolTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: School */
  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final School objectUnderTest = new School();

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void getCityOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getCity();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getNameOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getName();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getPhoneOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getPhone();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getStreetOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getStreet();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getTypeOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getType();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getZipcodeOutputNull() {

    // Arrange
    final School objectUnderTest = new School();

    // Act
    final String actual = objectUnderTest.getZipcode();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void setCityInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String city = null;

    // Act
    objectUnderTest.setCity(city);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void setNameInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String name = null;

    // Act
    objectUnderTest.setName(name);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void setPhoneInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String phone = null;

    // Act
    objectUnderTest.setPhone(phone);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void setStreetInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String street = null;

    // Act
    objectUnderTest.setStreet(street);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void setTypeInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String type = null;

    // Act
    objectUnderTest.setType(type);

    // Method returns void, testing that no exception is thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void setZipcodeInputNullOutputVoid() {

    // Arrange
    final School objectUnderTest = new School();
    final String zipcode = null;

    // Act
    objectUnderTest.setZipcode(zipcode);

    // Method returns void, testing that no exception is thrown
  }
}

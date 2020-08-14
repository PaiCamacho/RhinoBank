package com.stayready.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddressTest {
    Address address;
    String streetNumber;
    String streetName;
    String city;
    String state;
    String zip;

    @Before
    public void before(){
        streetNumber = "307";
        streetName = "Ladle";
        city = "Atlanta";
        state = "GA";
        zip = "23450";
        address = new Address(streetNumber, streetName, city, state, zip);
    }
    @Test
    public void AddressConstructorTest(){
        //Given
        String expectedStreetNumber = "307";
        String expectedStreetName = "Ladle";
        String expectedCity = "Atlanta";
        String expectedState = "GA";
        String expectedZip = "23450";
        //When
        //Then
        Assert.assertEquals(expectedStreetNumber, address.getStreetNumber());
        Assert.assertEquals(expectedStreetName, address.getStreetName());
        Assert.assertEquals(expectedCity, address.getCity());
        Assert.assertEquals(expectedState, address.getState());
        Assert.assertEquals(expectedZip, address.getZip());
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        //Then
        Assert.assertEquals(expected, address.getId());
    }
    @Test
    public void getStreetNumberTest(){
        //Given
        String expected = "307";
        //When
        //Then
        Assert.assertEquals(expected, address.getStreetNumber());
    }
    @Test
    public void getStreetNameTest(){
        //Given
        String expected = "Ladle";
        //When
        //Then
        Assert.assertEquals(expected, address.getStreetName());
    }
    @Test
    public void getCityTest(){
        //Given
        String expected = "Atlanta";
        //When
        //Then
        Assert.assertEquals(expected, address.getCity());
    }
    @Test
    public void getStateTest(){
        //Given
        String expected = "GA";
        //When
        //Then
        Assert.assertEquals(expected, address.getState());
    }
    @Test
    public void getZipTest(){
        //Given
        String expected = "23450";
        //When
        //Then
        Assert.assertEquals(expected, address.getZip());
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        address.setId(1234567891);
        //Then
        Assert.assertEquals(expected, address.getId());
    }
    @Test
    public void setStreetNumberTest(){
        //Given
        String expected = "302";
        //When
        address.setStreetNumber("302");
        //Then
        Assert.assertEquals(expected, address.getStreetNumber());
    }
    @Test
    public void setStreetNameTest(){
        //Given
        String expected = "Lend";
        //When
        address.setStreetName("Lend");
        //Then
        Assert.assertEquals(expected, address.getStreetName());
    }
    @Test
    public void setCityTest(){
        //Given
        String expected = "Atl";
        //When
        address.setCity("Atl");
        //Then
        Assert.assertEquals(expected, address.getCity());
    }
    @Test
    public void setStateTest(){
        //Given
        String expected = "Georgia";
        //When
        address.setState("Georgia");
        //Then
        Assert.assertEquals(expected, address.getState());
    }
    @Test
    public void setZipTest(){
        //Given
        String expected = "24350";
        //When
        address.setZip("24350");
        //Then
        Assert.assertEquals(expected, address.getZip());
    }
}

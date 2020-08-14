package com.stayready.domain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CustomerTest {
    String firstName;
    String lastName;
    Customer customer;
    @Before
    public void before(){
        firstName = "Lil";
        lastName = "Waters";
        customer = new Customer(firstName, lastName);
    }
    @Test
    public void CustomerConstructorTest(){
        //Given
        String expectedFirst = "Lil";
        String expectedLast = "Waters";
        //When
        //Then
        Assert.assertEquals(expectedFirst, customer.getFirstName());
        Assert.assertEquals(expectedLast, customer.getLastName());
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        //Then
        Assert.assertEquals(expected, customer.getId());
    }
    @Test
    public void getFirstNameTest(){
        //Given
        String expected = "Lil";
        //When
        //Then
        Assert.assertEquals(expected, customer.getFirstName());
    }
    @Test
    public void getLastNameTest(){
        //Given
        String expected = "Waters";
        //When
        //Then
        Assert.assertEquals(expected, customer.getLastName());
    }
    @Test
    public void getAddressTest(){
        //Given
        Set<Address> expected = null;
        //When
        //Then
        Assert.assertEquals(expected, customer.getAddress());
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        customer.setId(1234567891);
        //Then
        Assert.assertEquals(expected, customer.getId());
    }
    @Test
    public void setFirstNameTest(){
        //Given
        String expected = "Lily";
        //When
        customer.setFirstName("Lily");
        //Then
        Assert.assertEquals(expected, customer.getFirstName());
    }
    @Test
    public void setLastNameTest(){
        //Given
        String expected = "Water";
        //When
        customer.setLastName("Water");
        //Then
        Assert.assertEquals(expected, customer.getLastName());
    }
    @Test
    public void setAddressTest(){
        //Given
        Set<Address> expected = new HashSet<Address>();
        //When
        customer.setAddress(expected);
        //Then
        Assert.assertEquals(expected, customer.getAddress());
    }

}
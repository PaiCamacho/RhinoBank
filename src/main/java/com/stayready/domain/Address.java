package com.stayready.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "ADDRESS_ID")
    private long id;

    @Column(name = "ADDRESS_NUMBER")
    private String streetNumber;

    @Column(name = "ADDRESS_NAME")
    private String streetName;

    @Column(name = "ADDRESS_CITY")
    private String city;

    @Column(name = "ADDRESS_STATE")
    private String state;

    @Column(name = "ADDRESS_ZIP")
    private String zip;

    public Address(String streetNumber, String streetName, String city, String state, String zip){
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public long getId(){
        return this.id;
    }
    public String getStreetNumber(){
        return this.streetNumber;
    }
    public String getStreetName(){
        return this.streetName;
    }
    public String getCity(){
        return this.city;
    }
    public String getState(){
        return this.state;
    }
    public String getZip(){
        return this.zip;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setStreetNumber(String streetNumber){
        this.streetNumber = streetNumber;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZip(String zip){
        this.zip = zip;
    }
}

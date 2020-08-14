package com.stayready.domain;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ID")
    private long id;

    @Column(name = "CUSTOMER_FIRSTNAME")
    private String firstName;

    @Column(name = "CUSTOMER_LASTNAME")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CUSTOMER_ID")
    @OrderBy
    private Set<Address> address;

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public long getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public Set<Address> getAddress(){
        return this.address;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(Set<Address> address){
        this.address = address;
    }
}

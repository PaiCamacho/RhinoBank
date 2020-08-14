package com.stayready.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

enum Type{
    SAVINGS, CHECKING, CREDIT;
}
@Entity
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "ACCOUNT_ID")
    private long id;

    @Column(name = "ACCOUNT_TYPE")
    private Type accountType;

    @Column(name = "ACCOUNT_NICKNAME")
    private String nickname;

    @Column(name = "ACCOUNT_REWARDS")
    private Integer rewards;

    @Column(name = "ACCOUNT_BALANCE")
    private double balance;

    @Column(name = "ACCOUNT_CUSTOMER")
    private Customer customer;

    public Account(String nickname, Type accountType, double balance){
        this.nickname = nickname;
        this.accountType = accountType;
        this.balance = balance;
    }
    public long getId(){
        return this.id;
    }
    public Type getType() {
        return this.accountType;
    }
    public String getNickname(){
        return this.nickname;
    }
    public Integer getRewards(){
        return this.rewards;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setType(Type accountType){
        this.accountType = accountType;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }
    public void setRewards(Integer rewards){
        this.rewards = rewards;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}


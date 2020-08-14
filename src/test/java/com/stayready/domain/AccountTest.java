package com.stayready.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {
    Account account;
    String nickname;
    Type accountType;
    double balance;
    @Before
    public void before(){
        nickname = "Bob";
        accountType = Type.CHECKING;
        balance = 500.00;
        account = new Account(nickname, accountType, balance);
    }

    @Test
    public void AccountConstructorTest(){
        //Given
        String expectedNickname = "Bob";
        Type expectedAccountType = Type.CHECKING;
        double expectedBalance = 500.00;
        //When
        //Then
        Assert.assertEquals(expectedNickname, account.getNickname());
        Assert.assertEquals(expectedAccountType, account.getType());
        Assert.assertEquals(expectedBalance, account.getBalance(), 0.0000001);
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        //Then
        Assert.assertEquals(expected, account.getId());
    }
    @Test
    public void getTypeTest(){
        //Given
        Type expected = Type.CHECKING;
        //When
        //Then
        Assert.assertEquals(expected, account.getType());
    }
    @Test
    public void getNicknameTest(){
        //Given
        String expected = "Bob";
        //When
        //Then
        Assert.assertEquals(expected, account.getNickname());
    }
    @Test
    public void getRewardsTest(){
        //Given
        Integer expected = null;
        //When
        //Then
        Assert.assertEquals(expected, account.getRewards());
    }
    @Test
    public void getBalanceTest(){
        //Given
        double expected = 500.00;
        //When
        //Then
        Assert.assertEquals(expected, account.getBalance(), 0.0000001);
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        account.setId(1234567891);
        //Then
        Assert.assertEquals(expected, account.getId());
    }
    @Test
    public void setTypeTest(){
        //Given
        Type expected = Type.CREDIT;
        //When
        account.setType(Type.CREDIT);
        //Then
        Assert.assertEquals(expected, account.getType());
    }
    @Test
    public void setNicknameTest(){
        //Given
        String expected = "Peter";
        //When
        account.setNickname("Peter");
        //Then
        Assert.assertEquals(expected, account.getNickname());
    }
    @Test
    public void setRewardsTest(){
        //Given
        Integer expected = 50;
        //When
        account.setRewards(50);
        //Then
        Assert.assertEquals(expected, account.getRewards());
    }
    @Test
    public void setBalanceTest(){
        //Given
        double expected = 1000.00;
        //When
        account.setBalance(1000.00);
        //Then
        Assert.assertEquals(expected, account.getBalance(), 0.0000001);
    }
}
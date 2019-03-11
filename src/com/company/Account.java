package com.company;

public class Account {

    private double balance;

    public  Account( double intialBalance){

        if(intialBalance > 0.0)
        {
            balance = intialBalance;
        }

    }

    public void credit(double amount)
    {
        balance = balance + amount;

    }

    public double  getBalance()
    {
      return balance;
    }
}
package com.dariscalinor;

public class BankAccount {

    // Create fields for the class
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNo;

    // Define getter methods for each field
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    // Define Setter methods for each field
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    // Define method for deposit funds to account
    public void depositFund(int fund){
        this.balance += fund;
        System.out.println("You have deposit $" + fund + " to your account: " + this.accountNumber + ".");
        System.out.println("Account balance is $" + this.balance + ".");
    }

    // Define method for withdraw fund from account
    public void withdrawFund(int fund) {

        if(fund > this.balance) {
            System.out.println("You don't have enough money, " + this.customerName + ".");
            System.out.println("Account balance is $" + this.balance + ".");
        } else {
            this.balance -= fund;
            System.out.println("You have withdrawn $" + fund + " from your account: " + this.accountNumber + ".");
            System.out.println("Account balance is $" + this.balance + ".");
        }
    }

}

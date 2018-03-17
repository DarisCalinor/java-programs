package com.dariscalinor;

public class Main {

    public static void main(String[] args) {

        // Define account and its fields
        // Account 1
        BankAccount account1 = new BankAccount();
        account1.setAccountNumber(55669988);
        account1.setBalance(15000);
        account1.setCustomerName("Luthiela Daemar");
        account1.setEmail("luthiela@daemar.com");
        account1.setPhoneNo("+61414555555");

        // Accunt 2
        BankAccount account2 = new BankAccount();
        account2.setAccountNumber(11223344);
        account2.setBalance(1000);
        account2.setCustomerName("Daris Calinor");
        account2.setEmail("daris@calinor.com");
        account2.setPhoneNo("+61414777777");

        // Validation codes
        // Account 1
        account1.withdrawFund(1000);
        account1.depositFund(10000);
        account1.withdrawFund(100000);

        System.out.println("Details of account number: " + account1.getAccountNumber());
        System.out.println("Customer name: " + account1.getCustomerName());
        System.out.println("Account balance: " + account1.getBalance());
        System.out.println("E-mail: " + account1.getEmail());
        System.out.println("Phone: " + account1.getPhoneNo());

        // Account 2
        account2.withdrawFund(2500);
        account2.depositFund(10000);
        account2.withdrawFund(500);

        System.out.println("Details of account number: " + account2.getAccountNumber());
        System.out.println("Customer name: " + account2.getCustomerName());
        System.out.println("Account balance: " + account2.getBalance());
        System.out.println("E-mail: " + account2.getEmail());
        System.out.println("Phone: " + account2.getPhoneNo());

        // End
        System.out.println("End of program. I don't know how to terminate, yet.");

    }
}

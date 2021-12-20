package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email andn phone number

        // create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds(this should increment the balance field)
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdraw to complete if their are insufficient funds.
        // You will want to create various code in The Main Class ( The one created by IntelliJ to
        // confirm your code is working.
        // Add some system.out.println's in the two methods above as well.
        Account myAccount = new Account("124567", 0.00, "My Name",
                    "myemail@email.com", "5555555555");
        Account nope = new Account();
        myAccount.getNumber();
        myAccount.getCustomerEmailAddress();
        myAccount.withdrawal(500);
        myAccount.deposit(500);
        myAccount.withdrawal(50);

    }
}
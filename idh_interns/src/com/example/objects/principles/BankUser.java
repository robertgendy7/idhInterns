package com.example.objects.principles;

import com.example.objects.User;


public class BankUser extends User {

    private String bankAccount;

    // not how BankUser inherited age ,email ,name
    // but it adds it own customization
    public BankUser(int age, String email, String name, String bankAccount) {
        super(age, email, name);  // super refers to parent class
        this.bankAccount = bankAccount;
    }
}

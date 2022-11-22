package com.company;

public class PersonalAccount {

    private String numberAccount;
    private int balance =100;
    PersonalAccount(String numberAccount){
        this.numberAccount = numberAccount;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

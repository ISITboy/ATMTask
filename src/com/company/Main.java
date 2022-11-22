package com.company;

public class Main {

    public static void main(String[] args) {

        Client ivan = new Client("ivan","Ivanov","123456789AB");
        ivan.card= new BankСard("БеларусьБанк","1234567892344568","68467876567","1111");
        ATM atm = new ATM(ivan.getCard());

    }

}

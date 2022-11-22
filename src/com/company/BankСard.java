package com.company;

import jdk.jshell.execution.Util;

import java.util.LinkedList;
import java.util.List;

public class BankСard {

    private String numberCard;
    private String identificationNumber;
    private String pin;
    public String nameCard;
    public Bank bank;

    public BankСard(String nameCard,String numberCard,String identificationNumber, String pin){
        this.nameCard = nameCard;
        this.identificationNumber = identificationNumber;
        this.numberCard = numberCard;
        this.pin =pin;
        Utils.writeFileTextCardNumber(numberCard);
        bank = new Bank();
    }


    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}

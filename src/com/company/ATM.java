package com.company;

import java.util.Scanner;

public class ATM implements IAction {

    private int limitMoney;
    private BankСard card;

    public ATM(BankСard card){
        this.card = card;
        limitMoney = 100000;
        menu();
    }


    private void menu(){
        boolean exit=true;
        passwordVerification();

        while(exit) {
            System.out.println("\nMenu\n" +
                    "1 -> checkBalances\n" +
                    "2 -> withdrawMoney\n" +
                    "3 -> upBalance\n" +
                    "0 -> Exit");
            System.out.print("Next actions: ");
            Scanner in = new Scanner(System.in);
            short next = in.nextShort();
            switch (next) {
                case 1:
                    checkBalances();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    upBalance();
                    break;
                case 0:
                    System.out.println("Exit");
                    exit = false;
            }
        }

    }


    public boolean checkLimitATM(int sum){
        if(sum>limitMoney){
            return false;
        }
        else
            return true;
    }

    @Override
    public void passwordVerification() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input password: ");
        String password = in.nextLine();
        while (!password.equals(card.getPin())){
            System.out.print("Incorrect password\nInput password: ");
            password = in.nextLine();
        }
    }

    @Override
    public void checkBalances() {
        System.out.print("\nBalances = ");
        card.bank.ReadBalances();
    }

    @Override
    public void withdrawMoney() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nwithdrawMoney\n" +
                "sum: ");
        int sum = in.nextInt();
        if(card.bank.withdrawBalances(sum)&&checkLimitATM(sum)){
            System.out.println("Operation completed successfully");
        }else{
            System.out.println("Operation not completed successfully");
        }
    }

    @Override
    public void upBalance() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nupBalance\n" +
                "sum: ");
        int sum = in.nextInt();
        if (card.bank.upBalances(sum)) {
            System.out.println("Operation completed successfully");
        } else {
            System.out.println("Operation not completed successfully");
        }
    }
}

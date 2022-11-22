package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Bank {
    private PersonalAccount account;
    private HashMap<String, PersonalAccount> mapAccount = new HashMap<>();
    public Bank(){
        Utils.writeFileTextPersonalAccount();
        createPersonalAccount();
    }
    public void createPersonalAccount(){
        account =new PersonalAccount(Utils.readFileTextPA());
        mapAccount.put(Utils.readFileTextCN(),account);
    }


    public boolean withdrawBalances(int sum){
        for (String key: mapAccount.keySet()) {
            if(key.equals(Utils.readFileTextCN())) {
                account = mapAccount.get(key);
                if(sum<=account.getBalance()) {
                    account.setBalance(account.getBalance() - sum);
                    return true;
                }else{
                    return false;
                }
            }
        }
        return false;
    }
    public boolean upBalances(int sum){
        for (String key: mapAccount.keySet()) {
            if(key.equals(Utils.readFileTextCN())) {
                account = mapAccount.get(key);
                if(sum<=1000000&&sum>=0) {
                    account.setBalance(account.getBalance() + sum);
                    return true;
                }else{
                    return false;
                }

            }
        }
        return false;
    }

    public void ReadBalances(){
        for (String key: mapAccount.keySet()) {
            if(key.equals(Utils.readFileTextCN())) {
                account = mapAccount.get(key);
                System.out.println(account.getBalance());
            }
        }
    }
}

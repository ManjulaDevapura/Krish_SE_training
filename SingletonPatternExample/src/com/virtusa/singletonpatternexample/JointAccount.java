/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.singletonpatternexample;

import java.util.*;

/**
 *
 * @author Manjula Devapura
 */
public class JointAccount {

    private static volatile JointAccount jointAccount;
    private final String name = "Savings Joint Account";
    private int accountValue = 1000000000;
    private final List<JointAccountHolder> accountsList = new ArrayList<>();

// Sir I wanted to throw an Exception if this constructor called 
    // I used synchronized method and still call throw this exception
    JointAccount() {
        if (jointAccount != null) {
//            throw new RuntimeException("Please use addDepoite() Method to add into JointAccount ? ");
        }
    }
    void checkInstance() {
        if (jointAccount == null) {
            synchronized (JointAccount.class) {
                if (jointAccount == null) {
                    jointAccount = new JointAccount();
                }
            }
        }
    }

    void addNewHolder(JointAccountHolder jah) {
        checkInstance();
        jointAccount.accountsList.add(jah);
        System.out.println("--------------------\n" + "Created Holder " + jah);
        updateAccountValue(jah.getAssets());
        System.out.println(jointAccount + "\n--------------------");
    }

    void addDepoite(JointAccountHolder jah, long newDiposit) {
        updateAccountValue(newDiposit);
        printAccounts();
    }

    void updateAccountValue(long newDiposit) {
        jointAccount.accountValue += newDiposit;
        System.out.println(" Added = " + newDiposit + " --> " + jointAccount);
    }

    @Override
    public String toString() {
        return "Joint Account{ Name:- " + name + ",\tAccount Value:- " + accountValue + "}";
    }

    public JointAccount getJoint() {
        return jointAccount;
    }

    public void printAccounts() {
        for (JointAccountHolder jah : jointAccount.accountsList) {
            System.out.println(jah);
        }
    }

}

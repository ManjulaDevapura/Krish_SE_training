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

    JointAccount() {
        if (jointAccount != null) {
            throw new RuntimeException("Please use addDepoite() Method to add into JointAccount ? ");
        }
    }

    public static void checkInstance() {
        if (jointAccount == null) {
            synchronized (JointAccount.class) {
                if (jointAccount == null) {
                    jointAccount = new JointAccount();
                }
            }
        }
    }

    void addNewHolder(JointAccountHolder jah) {
        jointAccount.accountsList.add(jah);
        System.out.println("--------------------\n" + "Created Holder " + jah);
        updateAccountValue(jah.getName(), jah.getAsset());
        System.out.println(jointAccount + "\n--------------------");
    }

    void addDepoite(JointAccountHolder jah, long newDiposit) {
        updateAccountValue(jah.getName(), newDiposit);
    }

    void updateAccountValue(String holder, long newDiposit) {
        jointAccount.accountValue += newDiposit;
        System.out.println("Added (" + holder + ") = " + newDiposit + " --> ");
        printAccounts();
    }

    @Override
    public String toString() {
        return "Joint Account{ Name:- " + name + ",\tAccount Value:- " + accountValue + "}";
    }

    public static JointAccount getJoint() {
        checkInstance();
        return jointAccount;
    }

    public void printAccounts() {
        for (JointAccountHolder jah : jointAccount.accountsList) {
            System.out.println("\t" + jah);
        }
    }

}

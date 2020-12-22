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
    private long accountValue = 1000000000;
    private long newAddedValue = 0;

    private JointAccount() {
        if (jointAccount != null) {
            throw new RuntimeException("Please use addDepoite() Method to add into JointAccount ? ");
        }
    }

    public static JointAccount getJoint() {
        if (jointAccount == null) {
            synchronized (JointAccount.class) {
                if (jointAccount == null) {
                    jointAccount = new JointAccount();
                }
            }
        }
        return jointAccount;
    }

    public synchronized void updateAccountValue(long newDiposit) {
        jointAccount.newAddedValue = newDiposit;
        jointAccount.accountValue += newDiposit;
//        return jointAccount;
        System.out.println("Added (" + newDiposit + ") = " + jointAccount);
    }

    @Override
    public String toString() {
        return "Joint Account{ Name:- " + name + ",\tAccount Value:- " + accountValue + "}";
    }
}

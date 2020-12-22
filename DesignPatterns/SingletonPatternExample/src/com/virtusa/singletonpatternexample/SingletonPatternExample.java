/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.singletonpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class SingletonPatternExample {

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();

            JointAccount jointAcc1 = JointAccount.getJoint();
            System.out.println("Time spent :- " + (System.currentTimeMillis() - start));
            jointAcc1.updateAccountValue(111);

            start = System.currentTimeMillis();
            JointAccount jointAcc2 = JointAccount.getJoint();
            System.out.println("Time spent :- " + (System.currentTimeMillis() - start));
            jointAcc2.updateAccountValue(111000);

            start = System.currentTimeMillis();
            JointAccount jointAcc3 = JointAccount.getJoint();
            System.out.println("Time spent :- " + (System.currentTimeMillis() - start));
            jointAcc3.updateAccountValue(111000000);

        } catch (RuntimeException re) {
            System.out.println(" Error occred in Runtime :- " + re.getMessage());
        } catch (Exception e) {
            System.out.println(" Error :- " + e.getMessage());
        }
    }

}

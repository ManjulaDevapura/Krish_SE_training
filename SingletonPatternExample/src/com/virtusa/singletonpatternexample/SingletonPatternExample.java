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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            JointAccountHolder jah1 = new JointAccountHolder();
            jah1.setJointAccountHolder("Manjula", "Colombo 6", 1000000);

            JointAccountHolder jah2 = new JointAccountHolder();
            jah2.setJointAccountHolder("Devapura", "Colombo 7", 7000000);

            
            JointAccountHolder jah3 = new JointAccountHolder();
            jah3.setJointAccountHolder("Supun", "Gampaha", 100);

            JointAccountHolder jah4 = new JointAccountHolder();
            jah4.setJointAccountHolder("Hiran", "Moratuwa", 70);

            
            jah1.addAssets(10101);
            jah2.addAssets(70707);

        } catch (RuntimeException re) {
            System.out.println(" Error occred in Runtime :- " + re.getMessage());
        } catch (Exception e) {
            System.out.println(" Error :- " + e.getMessage());
        }
    }

}

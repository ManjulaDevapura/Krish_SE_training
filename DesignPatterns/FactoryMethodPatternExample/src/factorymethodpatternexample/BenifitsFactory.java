/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample;

import factorymethodpatternexample.cardtypes.*;

/**
 *
 * @author Manjula Devapura
 */
public class BenifitsFactory {

    public static Offer createPackage(BenifitCode benifitsCode) {
        switch (benifitsCode) {
            case SILVER:
                return new SilverCreditCard(7);
            case GOLD:
                return new GoldCreditCard(10);
            case PLATINUM:
                return new PlatinumCreditCard(30);
            default:
                return new DebitCard(5);
        }
    }
}

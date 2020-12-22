/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample.cardtypes;

import factorymethodpatternexample.Offer;
import factorymethodpatternexample.PercentageChanger;

import factorymethodpatternexample.benifits.EducationOffers;
import factorymethodpatternexample.benifits.GroceryOffers;
import factorymethodpatternexample.benifits.HotelsOffers;

/**
 *
 * @author Manjula Devapura
 */
public class SilverCreditCard extends Offer {


    public SilverCreditCard(int offerVal) {
        PercentageChanger.chagePercentage(offerVal);
    }

    @Override
    protected void createOffer() {
        offersList.add(new GroceryOffers());
        offersList.add(new EducationOffers());
        offersList.add(new HotelsOffers());
    }

}

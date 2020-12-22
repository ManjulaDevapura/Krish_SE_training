/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample.cardtypes;

import factorymethodpatternexample.Offer;
import factorymethodpatternexample.PercentageChanger;
import factorymethodpatternexample.benifits.GroceryOffers;

/**
 *
 * @author Manjula Devapura
 */
public class DebitCard extends Offer {

    public DebitCard(int offerVal) {
        PercentageChanger.chagePercentage(offerVal);
    }

    @Override
    protected void createOffer() {
        offersList.add(new GroceryOffers());
    }
}

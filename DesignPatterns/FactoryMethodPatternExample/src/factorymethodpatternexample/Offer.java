/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethodpatternexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manjula Devapura
 */
public abstract class Offer{
    
    protected List<Benifits> offersList = new ArrayList<>();

    public Offer() {
        createOffer();
    }

    protected abstract void createOffer();

    @Override
    public String toString() {
        return "Offers{"
                + "Benifits -> {" + offersList
                + "}\n";
    }

}

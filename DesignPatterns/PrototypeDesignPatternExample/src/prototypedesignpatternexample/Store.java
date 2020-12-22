/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpatternexample;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manjula Devapura
 */
public class Store {

    private Map<ItemType, Item> itemList = new HashMap<>();

    public Store() {
        this.setStoreItems();
    }

    public Item getItem(ItemType itemType) throws CloneNotSupportedException {
        return (Item) itemList.get(itemType).clone();
    }

    private void setStoreItems() {
        Shirt shirt = new Shirt();
        shirt.setPrice(2500);
        shirt.setQTY(5);
        shirt.setSleeveLength(15.5);
        shirt.setSleeveType("Long");
        itemList.put(ItemType.SHIRT, shirt);

        Shoe shoe = new Shoe();
        shoe.setPrice(7000);
        shoe.setQTY(2);
        shoe.setFeetSize(7);
        shoe.setShoeType("Casual");
        itemList.put(ItemType.SHOE, shoe);

        Trouser trouser = new Trouser();
        trouser.setPrice(3500);
        trouser.setQTY(3);
        trouser.setHeight(125);
        trouser.setHip(33);
        itemList.put(ItemType.TROUSER, trouser);

    }

}

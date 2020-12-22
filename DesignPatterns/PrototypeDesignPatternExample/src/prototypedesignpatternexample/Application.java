/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Store newStore = new Store();

            Shirt shirt1 = (Shirt) newStore.getItem(ItemType.SHIRT);
            System.out.println(shirt1);
            shirt1.setQTY(10);
            System.out.println(shirt1);

            Shirt shirt2 = (Shirt) newStore.getItem(ItemType.SHIRT);
            System.out.println(shirt2);

            Shirt shirt3 = shirt1;
            System.out.println(shirt3);
            System.out.println();

            shirt1.setQTY(11);
            System.out.println(shirt1);
            System.out.println(shirt2);
            System.out.println(shirt3);

        } catch (CloneNotSupportedException ex) {
            System.out.println("Error while clone the Item ");
        } catch (Exception ex) {
            System.out.println("Error unknown ?");
        }
    }

}

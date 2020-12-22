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
public class Item implements Cloneable{
    private int price;
    private int qty;

    public int getPrice() {
        return price;
    }

    public int getQTY() {
        return qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQTY(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" + "price=" + price + ", qty=" + qty + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

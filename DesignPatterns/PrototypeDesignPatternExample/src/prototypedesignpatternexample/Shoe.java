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
public class Shoe extends Item {

    private int feetSize;
    private String shoeType;

    public void setFeetSize(int feetSize) {
        this.feetSize = feetSize;
    }

    public void setShoeType(String shoeType) {
        this.shoeType = shoeType;
    }

    public int getFeetSize() {
        return feetSize;
    }

    public String getShoeType() {
        return shoeType;
    }

    @Override
    public String toString() {
        return "Shoe{" + "feetSize=" + feetSize + ", shoeType=" + shoeType + ", price=" + getPrice() + ", qty=" + getQTY() + '}';
    }

}

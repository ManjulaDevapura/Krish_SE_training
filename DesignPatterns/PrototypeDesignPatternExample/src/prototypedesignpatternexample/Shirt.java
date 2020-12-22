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
public class Shirt extends Item {

    private double sleeveLength;
    private String sleeveType;

    public void setSleeveLength(double sleeveLength) {
        this.sleeveLength = sleeveLength;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public double getSleeveLength() {
        return sleeveLength;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    @Override
    public String toString() {
        return "Shirt{" + "sleeveLength=" + sleeveLength + ", sleeveType=" + sleeveType + ", price=" + getPrice() + ", qty=" + getQTY() +'}';
    }

}

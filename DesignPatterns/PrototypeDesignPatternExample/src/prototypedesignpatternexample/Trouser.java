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
public class Trouser extends Item {

    private float hip;
    private float height;

    public void setHip(float hip) {
        this.hip = hip;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHip() {
        return hip;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Trouser{" + "hip=" + hip + ", height=" + height + ", price=" + getPrice() + ", qty=" + getQTY() + '}';
    }

}

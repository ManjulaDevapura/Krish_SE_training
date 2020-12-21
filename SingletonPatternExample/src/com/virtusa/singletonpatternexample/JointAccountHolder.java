/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.singletonpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class JointAccountHolder extends JointAccount {

    private String name = "";
    private String location = "";
    private long assets = 0;

    void setJointAccountHolder(String name, String location, long assets) {
        System.out.println("*************************************************");
        this.name = name;
        this.location = location;
        this.assets = assets;
        addNewHolder(this);
    }

    public long getAssets() {
        return this.assets;
    }

    public void addAssets(long addValue) {
        System.out.println("*************************************************");
        this.assets += addValue;
        addDepoite(this, addValue);
    }

    @Override
    public String toString() {
        return "Name:- " + name + "\tLocation:- " + location + "\tAssets:- " + assets;
    }

}

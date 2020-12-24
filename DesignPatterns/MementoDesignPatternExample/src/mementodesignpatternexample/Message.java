/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementodesignpatternexample;

/**
 *
 * @author Manjula Devapura
 */
public class Message {
    private final String message;
    private final String type; 

    public Message(String message, MessengerType type) {
        this.message = message;
        this.type = String.valueOf(type);
    }

    @Override
    public String toString() {
        return type + "\t= " + message + "";
    }
    
}

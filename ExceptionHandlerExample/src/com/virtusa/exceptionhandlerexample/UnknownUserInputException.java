/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.exceptionhandlerexample;

/**
 *
 * @author Manjula Devapura
 */
public class UnknownUserInputException extends Exception {

    public UnknownUserInputException() {
        super("Unknown User Input Exception ");
    }

    public UnknownUserInputException(String message) {
        super("Unknown User Input Exception :- " + message);
    }

    public UnknownUserInputException(String message, Exception ex) {
        super("Unknown User Input Exception :- " + message, ex);
    }
}

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
public class Calculator extends MathematicalOperation {

    public int firstNo;
    public int secondNo;
    public char mathOperation;

    public void setCalculator(String line) throws IllegalArgumentException, NumberFormatException {
        if (line.split(" ").length == 3) {
            firstNo = validateNoInput(line.split(" ")[0]);
            mathOperation = validateOperationInput(line.split(" ")[1]);
            secondNo = validateNoInput(line.split(" ")[2]);
            doOperation(firstNo, mathOperation, secondNo);
            printResult();
        } else {
            throw new IllegalArgumentException("Line shoud contain :- Number1 Operation Number2 ");
        }
    }

    public int validateNoInput(String val) throws NumberFormatException {
        int numberValue = 0;
        try {
            numberValue = Integer.parseInt(val);
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("Not a Number - " + val);
        }
        return numberValue;
    }

    public char validateOperationInput(String operationType) throws IllegalArgumentException {
        char operation = ' ';
        switch (operationType.charAt(0)) {
            case '+':
                operation = '+';
                break;
            case '-':
                operation = '-';
                break;
            case '*':
                operation = '*';
                break;
            case '/':
                operation = '/';
                break;
            default:
                 throw new IllegalArgumentException("Unknown operation type = "+operationType);
        }
        return operation;
    }
}

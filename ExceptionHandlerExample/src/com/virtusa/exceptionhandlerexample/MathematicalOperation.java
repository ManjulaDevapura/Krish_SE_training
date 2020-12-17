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
public class MathematicalOperation {
    private String result = "";

    public void doOperation(int firVal, char oper, int secVal) throws ArithmeticException {
        double operationVal = 0;
        switch (oper) {
            case '+':
                operationVal = firVal + secVal;
                break;
            case '-':
                operationVal = firVal - secVal;
                break;
            case '*':
                operationVal = firVal * secVal;
                break;
            case '/':
                if (secVal == 0) {
                    throw new ArithmeticException("Can't devide by 0");
                } else {
                    operationVal = Double.valueOf(firVal) / Double.valueOf(secVal);
                }
                break;
        }
        result = firVal + " " + (char) oper + " " + secVal + " = " + operationVal;
    }

    public void printResult() {
        System.out.println(result);
    }
}

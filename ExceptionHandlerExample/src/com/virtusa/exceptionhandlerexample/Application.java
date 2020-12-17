/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.exceptionhandlerexample;

import com.virtusa.exceptionhandlerexample.CalculationBufferedReader;
import com.virtusa.exceptionhandlerexample.Calculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Manjula Devapura
 */
//We should create 4 layer scenario 
//We should have meaningful checked exception
//We should have meaningful unchecked exception
//We should have child exception
//1st layer should throw exception of all 4 layers 
//we should able to see the stack trace
public class Application {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(new File("./src/com/virtusa/exceptionhandlerexample/file.txt"));
                CalculationBufferedReader buffReader = new CalculationBufferedReader(fileReader);) {

            String line;
            Calculator cal;
            while ((line = buffReader.readLine()) != null) {
                cal = new Calculator();
                cal.setCalculator(line);
            }

        } catch (FileNotFoundException fnex) {
            System.out.println("File not found in there  :- " + fnex.getMessage());
            fnex.printStackTrace();
        } catch (IOException ioex) {
            System.out.println("Error happened in the file :- " + ioex.getMessage());
            ioex.printStackTrace();
        } catch (RuntimeException rex) {
            System.out.println("Error happened while running :- " + rex.getMessage());
            rex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Error happened in the program :- " + ex);
//            System.out.println(Arrays.toString(ex.getStackTrace()));
            ex.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.virtusa.exceptionhandlerexample;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Manjula Devapura
 */
public class CalculationBufferedReader extends BufferedReader {

    public CalculationBufferedReader(Reader readedFile) {
        super(readedFile);
    }

    @Override
    public String readLine() throws FileNotFoundException {
        String currentLine = null;
        try {
            currentLine = super.readLine();
//             throw new IOException("IO Error?");
        } catch (IOException ex) {
            throw new FileNotFoundException("Empty file or end of the file");
        }
        if (currentLine == null) {
            return null;
        } else {
            return currentLine;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Manjula Devapura
 */
public class CapitalBufferedReader extends BufferedReader {

    public CapitalBufferedReader(Reader readedFile) {
        super(readedFile);
    }

    @Override
    public int read() throws IOException {
        int thisChar = super.read();
        if (thisChar == -1) {
            return -1;
        } else {
            String letter = String.valueOf((char) thisChar);
            String upperCaseLetter = letter.toUpperCase();
//            System.out.print(thisChar+" - "+letter+" - "+upperCaseLetter+" - "+upperCaseLetter.charAt(0)+"\t");
            return upperCaseLetter.charAt(0);
        }
    }
}

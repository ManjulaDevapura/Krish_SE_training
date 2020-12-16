/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalizedreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Manjula Devapura
 */
public class CapitalizedReader {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(new File("./src/capitalizedreader/file.txt"));
                CapitalBufferedReader buffReader = new CapitalBufferedReader(fileReader);) {

            int charGot = buffReader.read();
            while (charGot != -1) {
                System.out.print((char) charGot);
                charGot = buffReader.read();
            }

        } catch (IOException ioex) {
            System.out.println("Error happened in the file :- " + ioex);
        } catch (Exception ex) {
            System.out.println("Error happened in the program :- " + ex);
        }
    }
}

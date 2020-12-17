package reverseconverter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Manjula Devapura
 */
public class ReverseConverter {

    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader(new File("./src/reverseconverter/file.txt"));
                ReversedBufferedReader buffReader = new ReversedBufferedReader(fileReader);) {


            // return character and add into Deque 
            int charGot = buffReader.reversingValue();
            while (charGot != -1) {
                charGot = buffReader.reversingValue();
            }
            buffReader.printOrder();
            buffReader.printReverse();
        }  catch (IOException ioex) {
            System.out.println("Error happened in the file :- " + ioex);
        } catch (Exception ex) {
            System.out.println("Error happened in the program :- " + ex);
        }finally{
            
        }
    }
}

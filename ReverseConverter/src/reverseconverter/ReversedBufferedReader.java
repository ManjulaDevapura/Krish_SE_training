/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseconverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 *
 * @author Manjula Devapura
 */
public class ReversedBufferedReader extends BufferedReader {

    private final Deque<Character> reverseOrder = new ArrayDeque<>();
    private final Deque<Character> order = new LinkedList<>();

    public ReversedBufferedReader(Reader readedFile) {
        super(readedFile);
    }

    @Override
    public int read() throws IOException {
        int thisChar = super.read();
        if (thisChar == -1) {
            return -1;
        } else {
            reverseOrder.addFirst((char) thisChar);
            order.add((char) thisChar);
            return thisChar;
        }
    }

    public int reversingValue() throws IOException {
        int returnedChar = read();
        if (returnedChar != -1) {
            return returnedChar;
        } else {
            return -1;
        }
    }

    public void printOrder() {
        System.out.print("\nOrder :- \t");
        for (Character value : order) {
            System.out.print(value);
        }
    }
    
    public void printReverse() {
        System.out.print("\nReverse Order :- ");
        for (Character value : reverseOrder) {
            System.out.print(value);
        }
    }
}
